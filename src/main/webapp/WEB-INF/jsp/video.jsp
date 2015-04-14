<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head><title>Video</title></head>

<body class="audio-page">
    
    <header class="page-header">
        <div class="container cf">
            <div class="page-heading">
                <h1 class="page-heading__title">Video</h1>
            </div>
            <!-- End page heading -->
            
            <nav class="wrap-breadcrumb">
                <ul class="breadcrumb">
                    <li class="breadcrumb__item">
                        <a href="#" class="breadcrumb__link">Home page</a>
                    </li>

                    <li class="breadcrumb__item">
                        <a href="#" class="breadcrumb__link">Artist</a>
                    </li>

                    <li class="breadcrumb__item">
                        Video
                    </li>
                </ul>
                <!-- End breadcrumb -->
            </nav>
            <!-- End wrap breadcrumb -->
        </div>
        <!-- End container -->
    </header>
    <!-- End page header -->

    <div class="audio-container">
        <div class="container">
            <div class="widget_iframe" style="display:inline-block;width:100%;height:520px;margin:0;padding:0;border:0;"> <h1 class="title">Music Vidoes</h1><iframe class="widget_iframe" src="<c:url value="/resources/videoplaylist.jsp?user=skittelzmusic&playlist=PLDA9221DE23DE3E43" />" width="100%" height="100%" frameborder="0" scrolling="no"></iframe></div>
        </div>

        <div class="container">
        <div class="widget_iframe" style="display:inline-block;width:100%;height:520px;margin:0;padding:0;border:0;"> <h1 class="title">Free Styling</h1><iframe class="widget_iframe" src="<c:url value="/resources/videoplaylist.jsp?user=skittelzmusic&playlist=PLA7BA1F4FB482D08A" />" width="100%" height="100%" frameborder="0" scrolling="no"></iframe></div>
        </div>

        <div class="container">
            <div class="widget_iframe" style="display:inline-block;width:100%;height:520px;margin:0;padding:0;border:0;"> <h1 class="title">Performances</h1><iframe class="widget_iframe" src="<c:url value="/resources/videoplaylist.jsp?user=skittelzmusic&playlist=PLCB245AEA45090877" />" width="100%" height="100%" frameborder="0" scrolling="no"></iframe></div>
        </div>

        <div class="container">
            <div class="widget_iframe" style="display:inline-block;width:100%;height:520px;margin:0;padding:0;border:0;"> <h1 class="title">Film Appearances</h1><iframe class="widget_iframe" src="<c:url value="/resources/videoplaylist.jsp?user=skittelzmusic&playlist=PLCC7222441E3D6096" />" width="100%" height="100%" frameborder="0" scrolling="no"></iframe></div>
        </div>

        <div class="container">
            <div class="widget_iframe" style="display:inline-block;width:100%;height:520px;margin:0;padding:0;border:0;"> <h1 class="title">Vlog</h1><iframe class="widget_iframe" src="<c:url value="/resources/videoplaylist.jsp?user=skittelzmusic&playlist=PLA306EF54FAF852AA" />" width="100%" height="100%" frameborder="0" scrolling="no"></iframe></div>
        </div>

        <div class="container">
            <div class="widget_iframe" style="display:inline-block;width:100%;height:520px;margin:0;padding:0;border:0;"> <h1 class="title">Cameo's</h1><iframe class="widget_iframe" src="<c:url value="/resources/videoplaylist.jsp?user=skittelzmusic&playlist=PL445D00761807CA69" />" width="100%" height="100%" frameborder="0" scrolling="no"></iframe></div>
        </div>

        <!-- End container -->
    </div>
    <!-- End audio container -->
</body>
</html>