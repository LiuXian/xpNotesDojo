<!DOCTYPE HTML>
<html lang="en">
	<head>
		<meta charset="utf-8">
		<title>xpNotesDojo</title>
		<link rel="stylesheet" href="${_r.contextPath}/css/all.css" media="screen">
		<link rel="stylesheet" href="${_r.contextPath}/dojo-release-1.8.3/dijit/themes/claro/claro.css" media="screen">
		<script src="${_r.contextPath}/dojo-release-1.8.3/dojo/dojo.js" data-dojo-config="isDebug: true, async: true, parseOnLoad: true"></script>
		
		[@webBundle path="/js/" type="js"/]
	</head>
	<body class="claro">
		<div id="mainview"></div>
		
		<script type="text/javascript">
			var $mainview = $("body").find("#mainview");
			$(document).ready(function(){
				brite.display("UserLogin",$mainview);
			});
		</script>
		
		
	</body>
</html