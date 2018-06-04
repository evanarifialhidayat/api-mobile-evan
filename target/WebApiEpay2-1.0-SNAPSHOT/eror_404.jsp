<%-- 
    Document   : eror_404
    Created on : Oct 9, 2016, 11:41:05 PM
    Author     : ADITYA
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.2, user-scalable=yes" />
    <title>Celestino | only for creative minds.</title>
    <link rel="stylesheet" type="text/css" media="all" href="../css/reset.css" />
    <link rel="stylesheet" type="text/css" media="all" href="../css/bootstrap.css" />
    <link rel="stylesheet" type="text/css" media="all" href="style.css" />
    <link rel='stylesheet' id='custom-css'  href='../css/custom.css' type='text/css' media='all' />
    <link rel='stylesheet' id='google-fonts-css'  href='http://fonts.googleapis.com/css?family=Oswald%7CDroid+Sans%7CPlayfair+Display%7COpen+Sans+Condensed:300,400,800%3A300%7CRokkitt%7CShadows+Into+Light%7CMaven+Pro:400,700%7CAbel%7CMontez' type='text/css' media='all' />
    <link rel='stylesheet' id='responsive-css'  href='../css/responsive.css' type='text/css' media='all' />
    <link rel='stylesheet' id='thickbox-css'  href='../js/thickbox/thickbox.css' type='text/css' media='all' />
    <link rel='stylesheet' id='tipsy-css'  href='../css/tipsy.css' type='text/css' media='all' />
    <link rel='stylesheet' id='fonts-css'  href='../css/font-awesome.css' type='text/css' media='all' />
    <link rel='stylesheet' id='full-descriptor-css'  href='../portfolios/full-description/css/style.css' type='text/css' media='all' />
    <link rel='stylesheet' id='slide-details-css'  href='../portfolios/slide-detail/css/style.css' type='text/css' media='all' />
    <link rel='stylesheet' id='shortcode-css'  href='../css/shortcodes.css' type='text/css' media='all' />
    <link rel='stylesheet' id='colorbox-css'  href='../css/colorbox.css' type='text/css' media='all' />
    <link rel='stylesheet' id='custom-button-mfast-3-css'  href='../css/buttons/mfast-3.css' type='text/css' media='all' />
    <link rel='stylesheet' id='flexslider-css'  href='../sliders/flexslider/css/flexslider.css' type='text/css' media='all' />
    <link rel='stylesheet' id='flexslider-elegant-css'  href='../sliders/flexslider-elegant/css/slider.css' type='text/css' media='all' />
    <link rel='stylesheet' id='rs-css'  href='../sliders/revolution-slider/css/slider.css' type='text/css' media='all' />
    <link rel='stylesheet' id='rs-settings-css'  href='../sliders/revolution-slider/rs-plugin/css/settings.css' type='text/css' media='all' />
    <link rel='stylesheet' id='rs-captions-css'  href='../sliders/revolution-slider/rs-plugin/css/captions.css' type='text/css' media='all' />
    <link rel="shortcut icon" type="image/x-icon" href="favicon.ico" />
    <link rel="icon" type="image/x-icon" href="favicon.ico" />
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="../apple-touch-icon-144x.png" />
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="../apple-touch-icon-114x.png" />
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="../apple-touch-icon-72x.png">
    <link rel="apple-touch-icon-precomposed" href="../apple-touch-icon-57x.png" />
    <script type='text/javascript' src='../js/jquery/jquery.js'></script>
</head>
<body class="home page no_js responsive stretched">
<div class="bg-shadow">
<div id="wrapper" class="container group">
<script>
    jQuery(function($){
        var twitterSlider = function(){
            $('#topbar .last-tweets ul').addClass('slides');
            $('#topbar .last-tweets').flexslider({
                animation: "fade",
                slideshowSpeed: 5 * 1000,
                animationDuration: 700,
                directionNav: false,
                controlNav: false,
                keyboardNav: false
            });
        };
        $('#topbar .last-tweets > div').bind('tweetable_loaded', function(){
            twitterSlider();
        });
    });
</script>
<div id="page-meta" class="container">
    <div class="breadcrumbs">
        <p id="yit-breadcrumb" itemprop="breadcrumb">
            <a class="home" href="showLogin.html">Home Page</a> &gt;
            <a class="no-link current" >Error 404</a>
        </p>
    </div>
</div>
<div id="primary" class="sidebar-no">
    <div class="container group">
        <div class="row">
            <!-- START CONTENT -->
            <div id="content-index" class="span12 content group">
                <img class="error-404-image group" src="../images/pages/404.png" title="Error 404" alt="404" />
                <div class="error-404-text group">
                    <p>
                        We are sorry but the page you are looking for does not exist.
                        <br />
                        You could
                        <a href="showLogin.html">
                            return to the home page
                        </a>
                        or search using the search box below.
                    </p>
                </div>
            </div>
        </div>
    </div>
</div>
</div>
</div>
<script type='text/javascript' src='../js/jquery.colorbox-min.js'></script>
<script type='text/javascript' src='../js/jquery.flexslider-min.js'></script>
<script type='text/javascript' src='../js/jquery.tweetable.js'></script>
<script type='text/javascript' src='../js/jquery.superfish.js'></script>
<script type='text/javascript' src='../js/jquery.themepunch.plugins.min.js'></script>
<script type='text/javascript' src='../js/jquery.themepunch.revolution.js'></script>
<script type='text/javascript' src='../portfolios/filterable/js/jquery.filterable.js'></script>
<script type='text/javascript' src='../js/jquery.tipsy.js'></script>
<script type='text/javascript' src='../js/responsive.js'></script>
<script type='text/javascript' src='../js/jquery.mobilemenu.js'></script>
<script type='text/javascript' src='../js/shortcodes.js'></script>
<script type='text/javascript' src='../js/jquery/jquery.masonry.min.js'></script>
<script type='text/javascript' src='../js/jquery.custom.js'></script>
</body>
<!-- END BODY -->
</html>