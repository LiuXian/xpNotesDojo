(function(w){  
	w.render = function render(templateName,data){
		var tmpl = Handlebars.templates[templateName];
		if (!tmpl){
			tmpl = Handlebars.compile($("#" + templateName).html());
			Handlebars.templates[templateName] = tmpl;
		}
		return tmpl(data);
	}
})(window);

