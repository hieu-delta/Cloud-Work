angular
.module('MetronicApp')
.factory('RegisterService', 
		['$http', '$rootScope', 
		 function($http, $rootScope){
			var service = {};
			var localhost = $rootScope.h;
//			var localhost = 'http://localhost:8080/';
			service.f0 = f0;
			service.f1 = f1;
			service.f10 = f10;
			service.f11 = f11;
			service.f2 = f2;				
			service.f3 = f3;				
			service.f4 = f4;
			function f0(a, f){
				$http.post(localhost+'/check2_service_authen/bi/profilewithousession', a)
            	.success(function (x, y, z, t) {
            		f(x);
            	})
            	.error(function(x, y, z, t) {
            		f(x);
            	});
		    }
			function f1(a, f){
				$http.post(localhost+'/check2_service_authen/bi/signin', a)
            	.success(function (x, y, z, t) {
            		f(x);
            	})
            	.error(function(x, y, z, t) {
            		f(x);
            	});
		    }
			function f10(a, f){
				$http.post(localhost+'/check2_service_authen/bi/registration', a)
				.success(function (x, y, z, t) {
					f(x);
				})
				.error(function(x, y, z, t) {
					f(x);
				});
			}
			function f11(a, f){
				$http.post(localhost+'/check2_service_authen/bi/authentication', a)
				.success(function (x, y, z, t) {
					f(x);
				})
				.error(function(x, y, z, t) {
					f(x);
				});
			}
			function f2(a, f){
				$http.post(localhost+'check2_service_authen/bi/profile', a)
				.success(function (x, y, z, t) {
					f(x);
				})
				.error(function(x, y, z, t) {
					f(x);
				});
			}
			function f3(a, f){
				$http.post(localhost+'/check2_service_authen/bi/company', a)
				.success(function (x, y, z, t) {
					f(x);
				})
				.error(function(x, y, z, t) {
					f(x);
				});
			}
			function f4(a, f){
				$http.post(localhost+'/check2_service_company/company/create', a)
            	.success(function (x, y, z, t) {
            		f(x);
            	})
            	.error(function(x, y, z, t) {
            		f(x);
            	});
		    }
			return service;
		}]);