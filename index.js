var app = angular.module('diffDemo', ['diff-match-patch']);
  app.controller('diffCtrl', ['$scope','$http', function($scope,$http) {
    $http.get("https://www.w3schools.com/angular/customers.php").then(function (response) {
      $scope.revision="test";

      $scope.counter=0;
          $scope.createSearch=[];

          $scope.myData = response.data.records;
           $scope.left = JSON.stringify($scope.myData, undefined, 2);
           //$scope.left+$scope.left;
            //alert($scope.left);
          $scope.right=  angular.copy($scope.myData);
          $scope.right[0].Name="naveen";
          $scope.right[0].City="Indore";
          $scope.right[0].Country="India";

          $scope.right[0].Name="naveen";
          $scope.right[0].City="Indore";
          $scope.right[0].Country="India";

          $scope.right[2].Name="naveen";
          $scope.right[2].City="Indore";
          $scope.right[2].Country="India";

          $scope.right[4].Name="naveen";
          $scope.right[4].City="Indore";
          $scope.right[4].Country="India";

          $scope.right[6].Name="naveen";
          $scope.right[6].City="Indore";
          $scope.right[6].Country="India";

          $scope.right[8].Name="naveen";
          $scope.right[8].City="Indore";
          $scope.right[8].Country="India";

          $scope.right[10].Name="naveen";
          $scope.right[10].City="Indore";
          $scope.right[10].Country="India";


          $scope.right[12].Name="naveen";
          $scope.right[12].City="Indore";
          $scope.right[12].Country="India";

          $scope.right[14].Name="naveen";
          $scope.right[14].City="Indore";
          $scope.right[14].Country="India";

          var lastElement=undefined;
          var insCount=-1;
          var delCount=-1;
          var startLoop=0;

          $scope.right = JSON.stringify($scope.right, undefined, 2);

          $scope.scrollNext=function() {

          var allVar=$(".current").clone().children();
    
          for(var count=startLoop;count<allVar.length;count++) {
            var vr= allVar[count].classList[0];
            if(vr=='ins' && lastElement!='ins' &&  lastElement!='del') {
              insCount++;
              lastElement=vr;
              var createSearch= {
                "className":'ins',
                elePosition:insCount
              }
              startLoop=count+1;
              $scope.createSearch.push(createSearch);
              break;

            } else if(vr=='del' && lastElement!='ins' &&  lastElement!='del') {
              delCount++;
              lastElement=vr;
              var createSearch= {
                "className":'del',
                elePosition:delCount
              }
              startLoop=count+1;
              $scope.createSearch.push(createSearch);
              break;
            } else {
              lastElement=vr;
              if(vr=='del') {
                delCount++;
              } else if(vr=='ins') {
                insCount++;
              } else {

              }
            }
          }

            $("."+$scope.createSearch[$scope.counter].className)[$scope.createSearch[$scope.counter].elePosition].scrollIntoView(true);
            $scope.counter=$scope.counter+1;
          }

          $scope.scrollPrevious=function() {

            $("."+$scope.createSearch[$scope.counter-1].className)[$scope.createSearch[$scope.counter-1].elePosition].scrollIntoView(true);
            $scope.counter=$scope.counter-1;
          }

          $scope.setSearch=function() {

          }




         });
        }]);

          