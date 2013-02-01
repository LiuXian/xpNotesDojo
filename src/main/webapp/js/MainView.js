(function() {
	brite.registerView("MainView", {emptyParent:true}, {
		create: function(data,config){
			return render("tmpl-MainView");
		},
	   
		postDisplay: function(data,config){
			require(["dijit/form/Button", "dojo/domReady!"], function(Button) {
			    var button = new Button({
                    onClick: function(){ console.log("First button was clicked!"); }
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