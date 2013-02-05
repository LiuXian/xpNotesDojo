Handlebars.templates = Handlebars.templates || {};


// template --- tmpl-MainView ---
Handlebars.templates['tmpl-MainView'] = Handlebars.template(function (Handlebars,depth0,helpers,partials,data) {
  helpers = helpers || Handlebars.helpers;
  


  return "<div class=\"MainView appLayout\" data-dojo-type=\"dijit/layout/BorderContainer\" data-dojo-props=\"design: 'headline'\">\n		\n			<div class=\"centerPanel\" data-dojo-type=\"dijit/layout/ContentPane\" data-dojo-props=\"region: 'center'\">\n				<div>\n					<h4>Group 1 Content</h4>\n				</div>\n				<div>\n					<h4>Group 2 Content</h4>\n				</div>\n				<div>\n					<h4>Group 3 Content</h4>\n				</div>\n			</div>\n			\n			<div class=\"edgePanel\" data-dojo-type=\"dijit/layout/ContentPane\" data-dojo-props=\"region: 'top'\">\n				Welcome to xpNotesDojo\n			</div>\n			\n			<div class=\"leftCol edgePanel\" data-dojo-type=\"dijit/layout/ContentPane\" data-dojo-props=\"region: 'left', splitter: true\">\n				Topic List\n			</div>\n		</div>";}
);

// template --- tmpl-UserLogin ---
Handlebars.templates['tmpl-UserLogin'] = Handlebars.template(function (Handlebars,depth0,helpers,partials,data) {
  helpers = helpers || Handlebars.helpers;
  


  return "<div class=\"UserLogin\">\n		<div class=\"container\">\n			<div class=\"login\">\n				<h2>Login</h2>\n				<div class=\"field\">\n					<label>UserName:</label>\n					<input data-dojo-type=\"dijit/form/TextBox\" id=\"login-username\" type=\"text\" />\n				</div>\n				\n				<div class=\"field\">\n					<label>PassWord:</label>\n					<input data-dojo-type=\"dijit/form/TextBox\" id=\"login-password\" type=\"password\"/>\n				</div>\n				\n				<div class=\"field\">\n					<button id=\"login\" data-dojo-type=\"dijit/form/Button\">\n						Login\n					</button>\n				</div>\n			</div>\n			\n		\n			<div class=\"register\">\n				<h2>Register</h2>\n				<div class=\"field\">\n					<label>UserName:</label>\n					<input data-dojo-type=\"dijit/form/TextBox\" id=\"register-username\" type=\"text\"  />\n				</div>\n				\n				<div class=\"field\">\n					<label>PassWord:</label>\n					<input data-dojo-type=\"dijit/form/TextBox\" id=\"register-password\" type=\"password\" />\n				</div>\n				\n				<div class=\"field\">\n					<label>ReType PassWord:</label>\n					<input data-dojo-type=\"dijit/form/TextBox\" id=\"register-repassword\" type=\"password\" />\n				</div>\n				\n				<div class=\"field\">\n					<button id=\"register\" data-dojo-type=\"dijit/form/Button\">\n						Register\n					</button>\n				</div>\n			</div>\n			\n			</div>\n			\n	</div>";}
);
