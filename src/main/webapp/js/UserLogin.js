(function() {
	brite.registerView("UserLogin", {emptyParent:true}, {
		create: function(data,config){
			return render("tmpl-UserLogin");
		},
	   
		postDisplay: function(data,config){
			require(["dijit/form/Button", "dijit/form/TextBox", "dojo/domReady!"], function(Button) {
			    var button = new Button({
                    onClick: function(){ 
                        brite.display("MainView",$mainview); 
                    }
                }, "btn");
                button.startup();
			});
			
			/*
			require(["demo/myModule", "dojo/domReady!"], function(myModule){
			    myModule.setText("greeting", "Hello Dojo!");
			 
			    setTimeout(function(){
			        myModule.restoreText("greeting");
			    }, 1000);
			});
			*/
			/*
			require(["dojo/dom", "dojo/fx", "dojo/domReady!"], function(dom, fx){

                var greeting = dom.byId("greeting");
                greeting.innerHTML += " from Dojo!";
                 
                    fx.slideTo({
                        top: 100,
                        left: 200,
                        node: greeting
                    }).play();
                    
            });
            */
			
		},
	   
		events: {
	       
		}
	 
	});
})();