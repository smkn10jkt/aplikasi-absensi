angular.module('belajar', ['ui', 'belajar.controller'])
    .config(['$routeProvider', function($routeProvider){
        $routeProvider
            .when('/', {templateUrl: 'pages/home.html'})
            .when('/401', {templateUrl: 'pages/404.html', controller: 'LoginRedirectorController'})
            .when('/system/config', {templateUrl: 'pages/system/config.html', controller: 'ApplicationConfigController'})
            .when('/system/sessions', {templateUrl: 'pages/system/sessions.html', controller: 'ApplicationSessionsController'})
            .when('/system/user', {templateUrl: 'pages/system/user.html', controller: 'UserController'})
            .when('/system/role', {templateUrl: 'pages/system/role.html', controller: 'RoleController'})
            .when('/system/permission', {templateUrl: 'pages/system/permission.html', controller: 'PermissionController'})
            .when('/system/menu', {templateUrl: 'pages/system/menu.html', controller: 'SystemMenuController'})
            .when('/school/mapel', {templateUrl: 'pages/school/mapel.html'})
            .when('/notifications/sms', {templateUrl: 'pages/notifications/sms.html'})
            .when('/notifications/email', {templateUrl: 'pages/notifications/email.html'})
            .when('/school/school', {templateUrl: 'pages/school/school.html'})
            .when('/master/enroll', {templateUrl: 'pages/master/enroll.html'})
            .when('/school/student', {templateUrl: 'pages/school/student.html'})
            .when('/master/school', {templateUrl: 'pages/master/school.html', controller: 'SchoolController'})
            .when('/master/majors', {templateUrl: 'pages/master/majors.html'})
            .when('/master/grade', {templateUrl: 'pages/master/grade.html'})
            .when('/master/enroll', {templateUrl: 'pages/master/enroll.html'})
            .when('/master/timetable', {templateUrl: 'pages/master/timetable.html'})
            .when('/master/calendar', {templateUrl: 'pages/master/calendar.html'})
            .when('/report/student', {templateUrl: 'pages/report/student.html'})
            .when('/report/teacher', {templateUrl: 'pages/report/teacher.html'})
            .when('/report/employee', {templateUrl: 'pages/report/employee.html'})
            .when('/report/recap', {templateUrl: 'pages/report/recap.html'})
            .when('/setting/ip', {templateUrl: 'pages/setting/ip.html'})
            .when('/about', {templateUrl: 'pages/about.html', controller: 'AboutController'})
            .otherwise({templateUrl: 'pages/404.html'});
    }])
    .config(['$httpProvider', function($httpProvider){
        var sessionTimeoutInterceptor = ['$rootScope', '$location', '$q', function($rootScope, $location, $q){
            function success(response){
                return response;
            }
            
            function error(response){
                if (response.status === 401) {
                    $location.path('/401');
                }
            }
            
            return function(promise) {
                return promise.then(success, error);
            }
        }];
        
        
        $httpProvider.responseInterceptors.push(sessionTimeoutInterceptor);
        $httpProvider.responseInterceptors.push('httpLoadingSpinner');
        var spinnerFunction = function (data, headersGetter) {
            $('#loading').show();
        return data;
        };
        
    
    $httpProvider.defaults.transformRequest.push(spinnerFunction);
   }])
    .factory('httpLoadingSpinner', function ($q, $window) {
    return function (promise) {
        return promise.then(function (response) {
            // do something on success
        $('#loading').hide();
        return response;
    }, function (response) {
        // do something on error
        $('#loading').hide();
        return $q.reject(response);
        });
};
        })

;