(function() {
	brite.registerView("UserLogin", {emptyParent:true}, {
		create: function(data,config){
			return render("tmpl-UserLogin");
		},
	   
		postDisplay: function(data,config){
			require(["dijit/form/Button", "dijit/form/TextBox", "dojo/domReady!"], function(Button) {
			    var button = new Button({
                    onClick: function(){ 

					require(["dojo/query", "dojo/domReady"], function(query) {
						var username = query("#register-username")[0].value;
						var password = query("#register-password")[0].value;
						
						var objectType = "User";
						
						reqData = {
							username : username,
							password : password
						}
						
						console.log(reqData);
						
						require(["dojo/request"],function(request) {
							request.post(contextPath + "/User/daoRegister",{
								data : {
									objType : objectType,
									objJson : JSON.stringify(reqData)
								}
							}).then(function(text) {
								  brite.display("MainView",$mainview); 
							})
							
						})
						
					})
					
                    }
                }, "register");
                button.startup();
			});
			
			require(["dijit/form/Button", "dijit/form/TextBox", "dojo/domReady!"], function(Button) {
			    var button = new Button({
                    onClick: function(){ 

					require(["dojo/query", "dojo/domReady"], function(query) {
						var username = query("#login-username")[0].value;
						var password = query("#login-password")[0].value;
						
						var objectType = "User";
						
						reqData = {
							username : username,
							password : password
						}
						
						console.log(reqData);
						
						require(["dojo/request"],function(request) {
							request.post(contextPath + "/User/daoLogin",{
								data : {
									objType : objectType,
									username : username,
									password : password
								}
							}).then(function(result) {
								if(JSON.parse(result).id != null) {
									user_id = JSON.parse(result).id;
									brite.display("MainView", $mainview);
								}
							})
							
						})
						
					})
					
                    }
                }, "login");
                button.startup();
			});
		      
		}
	
	});
})();