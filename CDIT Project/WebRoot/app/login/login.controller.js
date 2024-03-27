angular
.module('MetronicApp')
.controller('LoginController', function($rootScope, $scope, $timeout, $location, $cookies, $window, LoginService) {
	$scope.sm1 = fn_sm1;
	$scope.sm2 = fn_sm2;
	(function initController() {
		console.log('anhdd-login');
		if($cookies.get('ck1')){
    		fn2($cookies.get('ck1')); 
    	}else{
    		$cookies.remove('ck1');
//    		$sessionStorage.$reset();       		
    	}
    })();
	function fn_sm1(a){
		$scope.l0 = true;
//		var rq = {};
//		rq.use_email = a;
//		LoginService.f0(rq, function (rp) {
//    		console.log(rp);
//    		if (rp.code == 200) {
//    			$scope.l0 = false;
//    			$scope.isPass = true; $scope.isAcc = false;
//    			$scope.s1 = rp.profile;
//    		} else {
//    			toastr.error(rp.desc);
//                $scope.l0 = false;
//    		}    		
//    	});
		$scope.sh2 = true; $scope.sh1 = false;
	}
	function fn_sm2(a1, a2){
		$scope.l0 = true;
//		var rq = {};
//		rq.use_email = a1;
//		rq.use_pwd = a2;
//		console.log(rq);
//    	LoginService.f1(rq, function (rp) {
//    		console.log(rp);
//    		if (rp.code == 200) {
//    			$cookies.put('ck1', rp.session);
//    			fn2(rp.session);
//    			$scope.l0 = false;
//    		}else if(rp.code == 403){
//    			toastr.error(rp.desc);    			
//    			$scope.l0 = false;
//    		}else if(rp.code == 401){
//    			toastr.error(rp.desc);    			
//    			$scope.isAuthen = true; $scope.isPass = false; $scope.isAcc = false;
//    			$scope.l0 = false;
//    		}else {
//    			toastr.error(rp.desc);
//                $scope.l0 = false;
//    		}    		
//    	});
		$location.path('/none');
	}
});