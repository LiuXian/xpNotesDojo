<!DOCTYPE HTML>
<html lang="en">
	<head>
		<meta charset="utf-8">
		<title>xpNotesDojo</title>
		<link rel="stylesheet" href="${_r.contextPath}/css/all.css" media="screen">
		<link rel="stylesheet" href="dojo-release-1.8.3/dijit/themes/liu/liu.css" media="screen">
		<script src="dojo-release-1.8.3/dojo/dojo.js" data-dojo-config="isDebug: true, async: true, parseOnLoad: true"></script>
		
		[@webBundle path="/js/" type="js"/]
		
		<script type="text/javascript">
			var contextPath = "${_r.contextPath}";
			var user_id;
		</script>
		
	</head>
	<body class="liu">
		
		<script type="text/javascript">
			var $mainview = $("body");
			$(document).ready(function(){
				brite.display("UserLogin",$mainview);
			});
		</script>
		
	</body>
</html