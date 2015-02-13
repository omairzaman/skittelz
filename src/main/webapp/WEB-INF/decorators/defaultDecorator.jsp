<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <title><sitemesh:write property='title'/></title>
    <meta name="description" content="HTML framework description">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=PT+Sans:400,700,400italic,700italic&amp;subset=latin,cyrillic,cyrillic-ext,latin-ext">
    <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Dosis&amp;subset=latin,latin-ext">
    <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800&amp;subset=latin,cyrillic-ext,greek,vietnamese,latin-ext,cyrillic">
    <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Abel">
    <!-- End fonts -->

    <script src="<c:url value="/resources/js/libs/jquery-1.10.2.min.js" />"></script>
    <script src="<c:url value="/resources/js/libs/jquery-ui.js" />"></script>
    <!-- End jQuery -->

    <link rel="stylesheet" href="<c:url value="/resources/css/general.css" />">
    <link rel="stylesheet" href="<c:url value="/resources/css/jquery-ui.css" />">
    <link rel="stylesheet" href="<c:url value="/resources/css/magnific-popup.css" />">
    <!-- End styles -->
    
    <script type='text/javascript' src="<c:url value="/resources/js/libs/modernizr-2.5.3.min.js" />">  </script>
     <!-- End modernizr -->

    <!--[if IE]>
        <script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
</head>
 

<body class="home-page">
    
    <div class="top-bar">
        <div class="container cf">
            <div class="account">
                <a href="#" class="account__item">My Account</a>  
                <a href="#" class="account__item">Register</a>
            </div>
            <!-- End  account -->

            <a href="#" class="shopping-cart">by this teame</a>
            <!-- End shopping cart -->

            <form name="search" action="#" method="get" class="search">
                <input type="text" placeholder="Search..." class="search__field">

                <button type="submit" class="search__btn">
                    <i class="search__icon"></i>
                </button>
            </form>
            <!-- End search -->
        </div>
        <!-- End container -->
    </div>
    <!-- End top bar -->

    <header class="header">
        <div class="container">
            <a href="index.html" class="logo">
                <img src="<c:url value="/resources/css/images/logo.png" />" alt="Calendo">
            </a>
            <!-- End logo -->

            <nav class="nav">
                <a href="artist.html" class="nav__item">Artist</a>
                <a href="audio.html" class="nav__item">Audio</a>
                <a href="blog.html" class="nav__item">Blog</a>
                <a href="tour.html" class="nav__item">Tour</a>
                <a href="events.html" class="nav__item">Events</a>
                <a href="contact.html" class="nav__item">Contact</a>
                <a href="gallery.html" class="nav__item">Gallery</a>
            </nav>  
            <!-- End nav -->
        </div>
        <!-- End container -->
    </header>
    <!-- End header -->
    <sitemesh:write property='body'/>
      <footer class="footer">
        <div class="top-section">
            <div class="container cf">
                <div class="brands">
                    <a href="#" target="_blank" class="brand brand_facebook">Facebook</a>
                    <a href="#" target="_blank" class="brand brand_flickr">Flickr</a>
                    <a href="#" target="_blank" class="brand brand_twitter">Twitter</a>
                    <a href="#" target="_blank" class="brand brand_vimeo">Vimeo</a>
                    <a href="#" target="_blank" class="brand brand_beatport">Beatport</a>
                </div>
                <!-- End brands -->

                <div class="contacts">
                    <div class="contacts__col">
                        <i class="contacts__icon contacts__icon_phone"></i>
                        (723) 592-9229-454
                    </div>

                    <div class="contacts__col">
                        <i class="contacts__icon contacts__icon_email"></i>
                        contact@calendo.com
                    </div>

                    <div class="contacts__col">
                        <i class="contacts__icon contacts__icon_address"></i>
                        Melbourne, AU, VIC 900
                    </div>
                </div>
                <!-- End contacts -->
            </div>
            <!-- End container -->
        </div>
        <!-- End top section -->

        <div class="middle-section">
            <div class="container cf">
                <section class="left-col">
                    <h1 class="second-title secondTitle_tweets">Latest tweets</h1>

                    <div class="tweets">
                        <article class="tweet">
                            <span class="tweet__text">It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout.</span>
                            <span class="tweet__user">@Calendo</span>
                            <span class="tweet__time">2 hours ago</span>
                        </article>
                        <!-- End tweet -->

                        <article class="tweet">
                            <span class="tweet__text">It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout.</span>
                            <span class="tweet__user">@Calendo</span>
                            <span class="tweet__time">2 hours ago</span>
                        </article>
                        <!-- End tweet -->
                    </div>
                    <!-- End tweets -->
                </section>
                <!-- End left col -->

                <section class="middle-col">
                    <h1 class="second-title">Category</h1>

                    <ul class="categories">
                        <li class="category">
                            <a href="#">Dubstep</a>
                        </li>

                        <li class="category">
                            <a href="#">Drum and Bass</a>
                        </li>

                        <li class="category">
                            <a href="#">UK Funky</a>
                        </li>

                        <li class="category">
                            <a href="#">Glitch Hop</a>
                        </li>

                        <li class="category">
                            <a href="#">Nu Skool Breaks</a>
                        </li>
                    </ul>
                    <!-- End categories -->
                </section>
                <!-- End middle col -->

                <section class="right-col">
                    <h1 class="second-title">Address</h1>

                    <div class="map">
                        <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d12599.294017368364!2d144.98197860000002!3d-37.86441995!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x6ad6686866392389%3A0x5045675218cdae0!2sSt+Kilda+VIC+3182!5e0!3m2!1sru!2s!4v1400661081919"></iframe>
                    </div>
                    <!-- End map -->
                </section>
                <!-- End right col -->
            </div>
            <!-- End container -->
        </div>
        <!-- End middle section -->

        <div class="bottom-section">
            <div class="container cf">
                <nav class="second-nav">
                    <a href="artist.html" class="second-nav__item">Artist</a>
                    <a href="audio.html" class="second-nav__item">Audio</a>
                    <a href="blog.html" class="second-nav__item">Blog</a>
                    <a href="tour.html" class="second-nav__item">Tour</a>
                    <a href="events.html" class="second-nav__item">Events</a>
                    <a href="contacts.html" class="second-nav__item">Contacts</a>
                    <a href="gallery.html" class="second-nav__item">Gallery</a>
                </nav>
                <!-- End second nav -->

                <div class="copy">&copy; 2014  All rights reserved.<span>Calendo</span></div>
                <!-- End copy -->
            </div>
            <!-- End container -->
        </div>
        <!-- End bottom section -->
    </footer>
    <!-- End footer -->

    <script>
        $(document).ready(function(){
            $("#jquery_jplayer_14").jPlayer({
                ready: function () {
                    $(this).jPlayer("setMedia", {
                        title: "LMFAO - Party Rock Anthem ft. Lauren Bennett, GoonRock",
                        m4a: "http://www.jplayer.org/audio/m4a/Miaow-07-Bubble.m4a",
                        oga: "http://www.jplayer.org/audio/ogg/Miaow-07-Bubble.ogg"
                    });
                },
                swfPath: "<c:url value="/resources/js" />",
                supplied: "m4a, oga",
                cssSelectorAncestor: '#jp_container_14'
            });
            /* End player 14 */

            $("#jquery_jplayer_15").jPlayer({
                ready: function () {
                    $(this).jPlayer("setMedia", {
                        title: "LMFAO - Party Rock Anthem ft. Lauren Bennett, GoonRock",
                        m4a: "http://www.jplayer.org/audio/m4a/Miaow-07-Bubble.m4a",
                        oga: "http://www.jplayer.org/audio/ogg/Miaow-07-Bubble.ogg"
                    });
                },
                swfPath: "<c:url value="/resources/js" />",
                supplied: "m4a, oga",
                cssSelectorAncestor: '#jp_container_15'
            });
            /* End player 15 */

            $("#jquery_jplayer_16").jPlayer({
                ready: function () {
                    $(this).jPlayer("setMedia", {
                        title: "LMFAO - Party Rock Anthem ft. Lauren Bennett, GoonRock",
                        m4a: "http://www.jplayer.org/audio/m4a/Miaow-07-Bubble.m4a",
                        oga: "http://www.jplayer.org/audio/ogg/Miaow-07-Bubble.ogg"
                    });
                },
                swfPath: "<c:url value="/resources/js" />",
                supplied: "m4a, oga",
                cssSelectorAncestor: '#jp_container_16'
            });
            /* End player 16 */

            $("#jquery_jplayer_17").jPlayer({
                ready: function () {
                    $(this).jPlayer("setMedia", {
                        title: "LMFAO - Party Rock Anthem ft. Lauren Bennett, GoonRock",
                        m4a: "http://www.jplayer.org/audio/m4a/Miaow-07-Bubble.m4a",
                        oga: "http://www.jplayer.org/audio/ogg/Miaow-07-Bubble.ogg"
                    });
                },
                swfPath: "<c:url value="/resources/js" />",
                supplied: "m4a, oga",
                cssSelectorAncestor: '#jp_container_17'
            });
            /* End player 17 */

            $("#jquery_jplayer_18").jPlayer({
                ready: function () {
                    $(this).jPlayer("setMedia", {
                        title: "LMFAO - Party Rock Anthem ft. Lauren Bennett, GoonRock",
                        m4a: "http://www.jplayer.org/audio/m4a/Miaow-07-Bubble.m4a",
                        oga: "http://www.jplayer.org/audio/ogg/Miaow-07-Bubble.ogg"
                    });
                },
                swfPath: "<c:url value="/resources/js" />",
                supplied: "m4a, oga",
                cssSelectorAncestor: '#jp_container_18'
            });
            /* End player 18 */
        });
    </script>

    <script src="<c:url value="/resources/js/libs/jquery.bxslider.min.js" />"></script>
    <script src="<c:url value="/resources/js/libs/jquery.magnific-popup.min.js" />"></script>
    <script src="<c:url value="/resources/js/libs/jquery.fitvids.js" />"></script>
    <script src="<c:url value="/resources/js/libs/jquery.jplayer.min.js" />"></script>
    <!-- End libs -->
    
    <script src="<c:url value="/resources/js/scripts.js" />"></script>
    <!-- End custom -->
 </body>
</html>