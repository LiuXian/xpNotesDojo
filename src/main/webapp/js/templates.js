Handlebars.templates = Handlebars.templates || {};


// template --- tmpl-MainView ---
Handlebars.templates['tmpl-MainView'] = Handlebars.template(function (Handlebars,depth0,helpers,partials,data) {
  helpers = helpers || Handlebars.helpers;
  


  return "<div class=\"MainView\">\n		<h1>All function will coming soon</h1>\n	</div>";}
);

// template --- tmpl-UserLogin ---
Handlebars.templates['tmpl-UserLogin'] = Handlebars.template(function (Handlebars,depth0,helpers,partials,data) {
  helpers = helpers || Handlebars.helpers;
  


  return "<div class=\"UserLogin\">\n		<div class=\"container\">\n			<div class=\"field\">\n				<label for=\"username\">UserName:</label>\n				<input data-dojo-type=\"dijit/form/TextBox\" type=\"text\" id=\"username\" />\n			</div>\n			\n			<div class=\"field\">\n				<label for=\"password\">PassWord:</label>\n				<input data-dojo-type=\"dijit/form/TextBox\" type=\"password\" id=\"password\" />\n			</div>\n			\n			<div class=\"field\">\n				<button id=\"btn\" data-dojo-type=\"dijit/form/Button\">\n					Login\n				</button>\n			</div>\n		</div>\n		\n	</div>";}
);
