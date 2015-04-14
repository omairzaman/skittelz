<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <title>YouTube TV</title>
    <link rel="stylesheet" href="<c:url value="/resources/css/ytv.css" />">
    <link rel="stylesheet" href="<c:url value="/resources/css/videoplayer.css" />">
    <style type="text/css">
        body{
            margin: 0;
            padding: 0;
        }
    </style>
</head>
<body>
<div id="frame"></div>
wow
<script src="<c:url value="/resources/js/libs/ytv.js" />"></script>
<script>
    window.onload = function(){


        var controller = new YTV('frame', {
            user: '<%=request.getParameter("user")%>' ,
            accent: 'yellow',
            element: null,
            playlist: '<%=(request.getParameter("playlist")==null?"":request.getParameter("playlist"))%>',
            fullscreen: false,
            controls: true,
            annotations: true,
            autoplay: false,
            chainVideos: true,
            browsePlaylists: true,
            wmode: 'opaque',
            events: {
                videoReady: function(){},
                stateChange: function(){}
            }
        });

    };
</script>

</body>
</html>
