(function() {
	brite.registerView("MainView", {emptyParent:true}, {
		create: function(data,config){
			return render("tmpl-MainView");
		},
	   
		postDisplay: function(data,config){
			require(["dojo/parser", "dojo/ready", "dijit/layout/BorderContainer", "dijit/layout/ContentPane"], function(parser, ready){
				ready(function(){
					parser.parse();
				});
			});
			
		},
	   
		events: {
	       
		}
	 
	});
})();