<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head><title>Contact</title></head>
<body>
 <header class="page-header">
        <div class="container cf">
            <div class="page-heading">
                <h1 class="page-heading__title">Contact</h1>
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
                        Contact
                    </li>
                </ul>
                <!-- End breadcrumb -->
            </nav>
            <!-- End wrap breadcrumb -->
        </div>
        <!-- End container -->
    </header>
    <!-- End page header -->

    <div class="contact-container">
        <div class="container cf">
            <section class="contact-info">
                <h1 class="title">Contact info</h1>

                <div class="contact-info__item">
                    <i class="contact-info__icon contact-info__icon_address"></i>
                    5512 Lorem Ipsum Vestibulum Molesqu, Dolor Sit Amet, Egestas 666 69
                </div>

                <div class="contact-info__item">
                    <i class="contact-info__icon contact-info__icon_mail"></i>
                    mail@compname.com
                </div>

                <div class="contact-info__item">
                    <i class="contact-info__icon contact-info__icon_phone"></i>
                    +1 800 450 6935<br>+1 800 450 6940
                </div>

                <div class="contact-info__entry">
                    <p>Vivamus id mollis quam. Morbi ac commodo nulla. In condimentum orci id nisl volutpat bibendum.<br>Quisque commodo hendrerit lorem quis egestas. 
                    Maecenas quis tortor arcu...</p>
                </div>    

                <div class="social">
                    <a href="#" target="_blank" class="social__item">
                        <i class="social__icon social__icon_instagram"></i>
                        Instagram &#8250;
                    </a>

                    <a href="#" target="_blank" class="social__item">
                        <i class="social__icon social__icon_facebook"></i>
                        Facebook &#8250;
                    </a>

                    <a href="#" target="_blank" class="social__item">
                        <i class="social__icon social__icon_twitter"></i>
                        Twitter &#8250;
                    </a>
                </div>
                <!-- End social -->
            </section>
            <!-- End Contact info -->

            <form class="contact-form cf" action="#" method="get">
                <h1 class="title">Contact calendo</h1>

                <div class="contact-form__left-col">
                    <input type="text" placeholder="Name">
                    <input type="email" placeholder="Email">
                </div>
            
                <div class="contact-form__right-col">
                    <textarea placeholder="Message"></textarea>
                    <button type="submit">Send</button>
                </div>
            </form>
            <!-- End Contact form -->
        </div>
        <!-- End Contrainer -->
    </div>
    <!-- End contact container -->

    <div class="contact-map">
        <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d190028.76432096245!2d12.535997900000014!3d41.91007109999999!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x132f6196f9928ebb%3A0xb90f770693656e38!2z0KDQuNC8!5e0!3m2!1sru!2s!4v1401175466281"></iframe>
    </div>
    <!-- End map -->
</body>
</html>