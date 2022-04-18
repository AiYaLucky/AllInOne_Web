<template>
  <!--整体主页布局-->
  <div class="page-container">
    <!--左侧菜单布局-->
    <div class="sidebar-menu toggle-others fixed">
      <div class="sidebar-menu-inner">
        <!--左侧菜单logo-->
        <header class="logo-env">
          <!-- logo -->
          <div class="logo">
            <a href="index.html" class="logo-expanded">
              <img src="../assets/images/logo.png" alt=""/>
            </a>
          </div>
          <div class="mobile-menu-toggle visible-xs">
            <a href="#" data-toggle="user-info-menu">
              <i class="linecons-cog"></i>
            </a>
            <a href="#" data-toggle="mobile-menu">
              <i class="fa-bars"></i>
            </a>
          </div>
        </header>
        <ul id="main-menu" class="main-menu">
          <li>
            <a href="#精选推荐" class="smooth">
              <i class="linecons-star"></i>
              <span class="title">精选推荐</span>
            </a>
          </li>
          <li>
            <a href="#在线影院" class="smooth">
              <i class="linecons-tv"></i>
              <span class="title">在线影院</span>
            </a>
          </li>
          <li>
            <a href="#影视下载" class="smooth">
              <i class="linecons-inbox"></i>
              <span class="title">影视下载</span>
            </a>
          </li>
          <li>
            <a href="#商用素材" class="smooth">
              <i class="linecons-database"></i>
              <span class="title">商用素材</span>
            </a>
          </li>
          <li>
            <a href="#音乐在线" class="smooth">
              <i class="linecons-database"></i>
              <span class="title">音乐无界</span>
            </a>
          </li>
          <li>
            <a href="#常用工具" class="smooth">
              <i class="linecons-tag"></i>
              <span class="title">常用工具</span>
            </a>
          </li>
          <li>
            <a href="#学习教程" class="smooth">
              <i class="linecons-pencil"></i>
              <span class="title">学习教程</span>
            </a>
          </li>
          <li>
            <a href="about.html">
              <i class="linecons-heart"></i>
              <span class="tooltip-blue">关于本站</span>
            </a>
          </li>
        </ul>
      </div>
    </div>
    <!--主页内容区域布局-->
    <div class="main-content">
      <nav class="navbar user-info-navbar" role="navigation">
        <ul class="user-info-menu left-links list-inline list-unstyled">
          <li class="hidden-sm hidden-xs">
            <a href="#" data-toggle="sidebar">
              <i class="fa-bars"></i>
            </a>
          </li>
          <li class="dropdown hover-line language-switcher">
            <a href="../views/HomeView.vue" class="dropdown-toggle" data-toggle="dropdown">
              <img src="../assets/flags/flag-cn.png" alt="flag-cn"/> Chinese
            </a>
            <ul class="dropdown-menu languages">
              <li>
                <a href="../views/HomeView.vue">
                  <img src="../assets/flags/flag-us.png" alt="flag-us"/> English
                </a>
              </li>
              <li class="active">
                <a href="../views/HomeView.vue">
                  <img src="../assets/flags/flag-cn.png" alt="flag-cn"/> Chinese
                </a>
              </li>
            </ul>
          </li>
        </ul>
        <ul class="user-info-menu right-links list-inline list-unstyled">
          <li class="hidden-sm hidden-xs">
            <a href="https://github.com/WebStackPage/WebStackPage.github.io" target="_blank">
              <i class="fa-github"></i> GitHub
            </a>
          </li>
        </ul>
      </nav>
      <!-- 精选推荐 -->
      <h4 class="text-gray"><i class="linecons-tag" style="margin-right: 7px;" id="精选推荐"></i><strong
          style="color: #f07c82">精选推荐</strong></h4>
      <div class="row">
        <div class="col-sm-3">
          <div class="xe-widget xe-conversations box2 label-info"
               onclick="window.open('https://www.subaibaiys.com/', '_blank')" data-toggle="tooltip"
               data-placement="bottom" title="" data-original-title="https://dribbble.com/">
            <div class="xe-comment-entry">
              <a class="xe-user-img">
                <img data-src="../assets/images/logos/subaibaiys.ico" class="lozad img-circle" width="40">
              </a>
              <div class="xe-comment">
                <a href="#" class="xe-user-name overflowClip_1">
                  <strong>素白白影视</strong>
                </a>
                <p>速度不错的在线影视网站。注册后支持留言，进行片源申请添加之类的操作。
                </p>
              </div>
            </div>
          </div>
        </div>
        <div class="col-sm-3">
          <div class="xe-widget xe-conversations box2 label-info"
               onclick="window.open('https://www.baipiaozhe.com/', '_blank')" data-toggle="tooltip"
               data-placement="bottom" title="" data-original-title="https://behance.net/">
            <div class="xe-comment-entry">
              <a class="xe-user-img">
                <img data-src="../assets/images/logos/baipiaozhe.png" class="lozad img-circle" width="40">
              </a>
              <div class="xe-comment">
                <a href="#" class="xe-user-name overflowClip_1">
                  <strong>白嫖者联盟</strong>
                </a>
                <p class="overflowClip_2">没什么广告，并且支持自己站点的提交，作者审核通过之后可以收录。</p>
              </div>
            </div>
          </div>
        </div>
        <div class="col-sm-3">
          <div class="xe-widget xe-conversations box2 label-info"
               onclick="window.open('http://www.ui.cn/', '_blank')" data-toggle="tooltip" data-placement="bottom"
               title="" data-original-title="http://www.ui.cn/">
            <div class="xe-comment-entry">
              <a class="xe-user-img">
                <img data-src="../assets/images/logos/uicn.png" class="lozad img-circle" width="40">
              </a>
              <div class="xe-comment">
                <a href="#" class="xe-user-name overflowClip_1">
                  <strong>UI中国</strong>
                </a>
                <p class="overflowClip_2">图形交互与界面设计交流、作品展示、学习平台。</p>
              </div>
            </div>
          </div>
        </div>
        <div class="col-sm-3">
          <div class="xe-widget xe-conversations box2 label-info"
               onclick="window.open('http://www.zcool.com.cn/', '_blank')" data-toggle="tooltip"
               data-placement="bottom" title="" data-original-title="http://www.zcool.com.cn/">
            <div class="xe-comment-entry">
              <a class="xe-user-img">
                <img data-src="../assets/images/logos/zcool.png" class="lozad img-circle" width="40">
              </a>
              <div class="xe-comment">
                <a href="#" class="xe-user-name overflowClip_1">
                  <strong>站酷</strong>
                </a>
                <p class="overflowClip_2">中国人气设计师互动平台</p>
              </div>
            </div>
          </div>
        </div>
      </div>
      <br/>
      <!-- END 精选推荐 -->
      <!-- 在线影院 -->
      <h4 class="text-gray"><i class="linecons-tag" style="margin-right: 7px;" id="在线影院"></i><strong
          style="color: #f07c82">在线影院</strong></h4>
      <div class="row">
        <div class="col-sm-3">
          <div class="xe-widget xe-conversations box2 label-info"
               onclick="window.open('https://www.leiphone.com/', '_blank')" data-toggle="tooltip"
               data-placement="bottom" title="" data-original-title="https://www.leiphone.com/">
            <div class="xe-comment-entry">
              <a class="xe-user-img">
                <img data-src="../assets/images/logos/leiphone.png" class="lozad img-circle" width="40">
              </a>
              <div class="xe-comment">
                <a href="#" class="xe-user-name overflowClip_1">
                  <strong>雷锋网</strong>
                </a>
                <p class="overflowClip_2">人工智能和智能硬件领域的互联网科技媒体</p>
              </div>
            </div>
          </div>
        </div>
        <div class="col-sm-3">
          <div class="xe-widget xe-conversations box2 label-info"
               onclick="window.open('http://36kr.com/', '_blank')" data-toggle="tooltip" data-placement="bottom"
               title="" data-original-title="http://36kr.com/">
            <div class="xe-comment-entry">
              <a class="xe-user-img">
                <img data-src="../assets/images/logos/36kr.png" class="lozad img-circle" width="40">
              </a>
              <div class="xe-comment">
                <a href="#" class="xe-user-name overflowClip_1">
                  <strong>36kr</strong>
                </a>
                <p class="overflowClip_2">创业资讯、科技新闻</p>
              </div>
            </div>
          </div>
        </div>
        <div class="col-sm-3">
          <div class="xe-widget xe-conversations box2 label-info"
               onclick="window.open('https://www.digitaling.com/', '_blank')" data-toggle="tooltip"
               data-placement="bottom" title="" data-original-title="https://www.digitaling.com/">
            <div class="xe-comment-entry">
              <a class="xe-user-img">
                <img data-src="../assets/images/logos/digitaling.png" class="lozad img-circle" width="40">
              </a>
              <div class="xe-comment">
                <a href="#" class="xe-user-name overflowClip_1">
                  <strong>数英网</strong>
                </a>
                <p class="overflowClip_2">数字媒体及职业招聘网站</p>
              </div>
            </div>
          </div>
        </div>
        <div class="col-sm-3">
          <div class="xe-widget xe-conversations box2 label-info"
               onclick="window.open('http://www.lieyunwang.com/', '_blank')" data-toggle="tooltip"
               data-placement="bottom" title="" data-original-title="http://www.lieyunwang.com/">
            <div class="xe-comment-entry">
              <a class="xe-user-img">
                <img data-src="../assets/images/logos/lieyunwang.png" class="lozad img-circle" width="40">
              </a>
              <div class="xe-comment">
                <a href="#" class="xe-user-name overflowClip_1">
                  <strong>猎云网</strong>
                </a>
                <p class="overflowClip_2">互联网创业项目推荐和创业创新资讯</p>
              </div>
            </div>
          </div>
        </div>
      </div>
      <br/>
      <!--END 在线影院 -->
      <!-- 影视下载 -->
      <h4 class="text-gray"><i class="linecons-tag" style="margin-right: 7px;" id="影视下载"></i><strong
          style="color: #c04851">影视下载</strong></h4>
      <div class="row">
        <div class="col-sm-3">
          <div class="xe-widget xe-conversations box2 label-info"
               onclick="window.open('https://www.producthunt.com/', '_blank')" data-toggle="tooltip"
               data-placement="bottom" title="" data-original-title="https://www.producthunt.com/">
            <div class="xe-comment-entry">
              <a class="xe-user-img">
                <img data-src="../assets/images/logos/producthunt.png" class="lozad img-circle" width="40">
              </a>
              <span class="label label-info" data-toggle="tooltip" data-placement="left" title=""
                    data-original-title="Hello I am a Tooltip"></span>
              <div class="xe-comment">
                <a href="#" class="xe-user-name overflowClip_1">
                  <strong>Producthunt</strong>
                </a>
                <p class="overflowClip_2">发现新鲜有趣的产品</p>
              </div>
            </div>
          </div>
        </div>
        <div class="col-sm-3">
          <div class="xe-widget xe-conversations box2 label-info"
               onclick="window.open('http://next.36kr.com/posts', '_blank')" data-toggle="tooltip"
               data-placement="bottom" title="" data-original-title="http://next.36kr.com/posts">
            <div class="xe-comment-entry">
              <a class="xe-user-img">
                <img data-src="../assets/images/logos/NEXT.png" class="lozad img-circle" width="40">
              </a>
              <div class="xe-comment">
                <a href="#" class="xe-user-name overflowClip_1">
                  <strong>NEXT</strong>
                </a>
                <p class="overflowClip_2">不错过任何一个新产品</p>
              </div>
            </div>
          </div>
        </div>
        <div class="col-sm-3">
          <div class="xe-widget xe-conversations box2 label-info"
               onclick="window.open('https://sspai.com/', '_blank')" data-toggle="tooltip" data-placement="bottom"
               title="" data-original-title="https://sspai.com/">
            <div class="xe-comment-entry">
              <a class="xe-user-img">
                <img data-src="../assets/images/logos/sspai.png" class="lozad img-circle" width="40">
              </a>
              <div class="xe-comment">
                <a href="#" class="xe-user-name overflowClip_1">
                  <strong>少数派</strong>
                </a>
                <p class="overflowClip_2">高品质数字消费指南</p>
              </div>
            </div>
          </div>
        </div>
        <div class="col-sm-3">
          <div class="xe-widget xe-conversations box2 label-info"
               onclick="window.open('http://liqi.io/', '_blank')" data-toggle="tooltip" data-placement="bottom"
               title="" data-original-title="http://liqi.io/">
            <div class="xe-comment-entry">
              <a class="xe-user-img">
                <img data-src="../assets/images/logos/liqi.png" class="lozad img-circle" width="40">
              </a>
              <div class="xe-comment">
                <a href="#" class="xe-user-name overflowClip_1">
                  <strong>利器</strong>
                </a>
                <p class="overflowClip_2">创造者和他们的工具</p>
              </div>
            </div>
          </div>
        </div>
      </div>
      <br/>
      <!--END 影视下载 -->
      <!-- 商用素材 -->
      <h4 class="text-gray"><i class="linecons-tag" style="margin-right: 7px;" id="商用素材"></i><strong
          style="color: #de1c31">商用素材</strong></h4>
      <div class="row">
        <div class="col-sm-3">
          <div class="xe-widget xe-conversations box2 label-info"
               onclick="window.open('https://www.pttrns.com/', '_blank')" data-toggle="tooltip"
               data-placement="bottom" title="" data-original-title="https://www.pttrns.com/">
            <div class="xe-comment-entry">
              <a class="xe-user-img">
                <img data-src="../assets/images/logos/Pttrns.png" class="lozad img-circle" width="40">
              </a>
              <div class="xe-comment">
                <a href="#" class="xe-user-name overflowClip_1">
                  <strong>Pttrns</strong>
                </a>
                <p class="overflowClip_2">Check out the finest collection of design patterns, resources,
                  mobile apps and inspiration</p>
              </div>
            </div>
          </div>
        </div>
        <div class="col-sm-3">
          <div class="xe-widget xe-conversations box2 label-info"
               onclick="window.open('http://collectui.com/', '_blank')" data-toggle="tooltip"
               data-placement="bottom" title="" data-original-title="http://collectui.com/">
            <div class="xe-comment-entry">
              <a class="xe-user-img">
                <img data-src="../assets/images/logos/CollectUI.png" class="lozad img-circle" width="40">
              </a>
              <div class="xe-comment">
                <a href="#" class="xe-user-name overflowClip_1">
                  <strong>Collect UI</strong>
                </a>
                <p class="overflowClip_2">Daily inspiration collected from daily ui archive and beyond.</p>
              </div>
            </div>
          </div>
        </div>
        <div class="col-sm-3">
          <div class="xe-widget xe-conversations box2 label-info"
               onclick="window.open('http://ui.uigreat.com/', '_blank')" data-toggle="tooltip"
               data-placement="bottom" title="" data-original-title="http://ui.uigreat.com/">
            <div class="xe-comment-entry">
              <a class="xe-user-img">
                <img data-src="../assets/images/logos/uiuigreat.png" class="lozad img-circle" width="40">
              </a>
              <div class="xe-comment">
                <a href="#" class="xe-user-name overflowClip_1">
                  <strong>UI uigreat</strong>
                </a>
                <p class="overflowClip_2">APP界面截图参考</p>
              </div>
            </div>
          </div>
        </div>
        <div class="col-sm-3">
          <div class="xe-widget xe-conversations box2 label-info"
               onclick="window.open('http://androidniceties.tumblr.com/', '_blank')" data-toggle="tooltip"
               data-placement="bottom" title="" data-original-title="http://androidniceties.tumblr.com/">
            <div class="xe-comment-entry">
              <a class="xe-user-img">
                <img data-src="../assets/images/logos/AndroidNiceties.png" class="lozad img-circle"
                     width="40">
              </a>
              <div class="xe-comment">
                <a href="#" class="xe-user-name overflowClip_1">
                  <strong>Android Niceties</strong>
                </a>
                <p class="overflowClip_2">A collection of screenshots encompassing some of the most
                  beautiful looking Android apps.</p>
              </div>
            </div>
          </div>
        </div>
      </div>
      <!--END 商用素材 -->
      <br/>
      <!-- 音乐在线 -->
      <h4 class="text-gray"><i class="linecons-tag" style="margin-right: 7px;" id="音乐在线"></i><strong
          style="color: #cc163a">音乐在线</strong></h4>
      <div class="row">
        <div class="col-sm-3">
          <div class="xe-widget xe-conversations box2 label-info"
               onclick="window.open('https://www.aliyun.com/minisite/goods?userCode=xtct5egx&share_source=copy_link', '_blank')"
               data-toggle="tooltip" data-placement="bottom" title=""
               data-original-title="https://www.aliyun.com/">
            <div class="xe-comment-entry">
              <a class="xe-user-img">
                <img data-src="../assets/images/logos/aliyun.png" class="lozad img-circle" width="40">
              </a>
              <div class="xe-comment">
                <a href="#" class="xe-user-name overflowClip_1">
                  <strong>阿里云</strong>
                </a>
                <p class="overflowClip_2">点击领取2000元限量云产品优惠券</p>
              </div>
            </div>
          </div>
        </div>
        <div class="col-sm-3">
          <div class="xe-widget xe-conversations box2 label-info"
               onclick="window.open('https://www.gulusucai.com/', '_blank')" data-toggle="tooltip"
               data-placement="bottom" title="" data-original-title="https://www.gulusucai.com/">
            <div class="xe-comment-entry">
              <a class="xe-user-img">
                <img data-src="../assets/images/logos/gulusucai.png" class="lozad img-circle" width="40">
              </a>
              <div class="xe-comment">
                <a href="#" class="xe-user-name overflowClip_1">
                  <strong>咕噜素材</strong>
                </a>
                <p class="overflowClip_2">质量很高的设计素材网站（推荐）</p>
              </div>
            </div>
          </div>
        </div>
        <div class="col-sm-3">
          <div class="xe-widget xe-conversations box2 label-info"
               onclick="window.open('https://xiyou4you.us/r/?s=13731627', '_blank')" data-toggle="tooltip"
               data-placement="bottom" title="" data-original-title="https://xiyou4you.us">
            <div class="xe-comment-entry">
              <a class="xe-user-img">
                <img data-src="../assets/images/logos/xiyou.png" class="lozad img-circle" width="40">
              </a>
              <div class="xe-comment">
                <a href="#" class="xe-user-name overflowClip_1">
                  <strong>西游-科学上网</strong>
                </a>
                <p class="overflowClip_2">优秀的科学上网（略贵，但是贼稳，点击注册领取优惠券）</p>
              </div>
            </div>
          </div>
        </div>
        <!-- <div class="col-sm-3">
            <div class="xe-widget xe-conversations box2 label-info" onclick="window.open('https://www.link360.top/', '_blank')" data-toggle="tooltip" data-placement="bottom" title="" data-original-title="https://www.link360.top/">
                <div class="xe-comment-entry">
                    <a class="xe-user-img">
                        <img data-src="../assets/images/logos/ss-kexueshangwang.png" class="lozad img-circle" width="40">
                    </a>
                    <div class="xe-comment">
                        <a href="#" class="xe-user-name overflowClip_1">
                            <strong>SS梯子</strong>
                        </a>
                        <p class="overflowClip_2">SS梯子-科学上网（实惠，但是不太稳）</p>
                    </div>
                </div>
            </div>
        </div> -->
        <div class="col-sm-3">
          <div class="xe-widget xe-conversations box2 label-info"
               onclick="window.open('https://www.shejizhoukan.com/', '_blank')" data-toggle="tooltip"
               data-placement="bottom" title="" data-original-title="https://www.shejizhoukan.com/">
            <div class="xe-comment-entry">
              <a class="xe-user-img">
                <img data-src="../assets/images/logos/shejizhoukan.png" class="lozad img-circle" width="40">
              </a>
              <div class="xe-comment">
                <a href="#" class="xe-user-name overflowClip_1">
                  <strong>设计周刊</strong>
                </a>
                <p class="overflowClip_2">最新设计资讯（每天更新）</p>
              </div>
            </div>
          </div>
        </div>
      </div>
      <br/>
      <!--END 音乐在线 -->
      <!-- 常用工具 -->
      <h4 class="text-gray"><i class="linecons-tag" style="margin-right: 7px;" id="常用工具"></i><strong
          style="color: #f03752">常用工具</strong></h4>
      <div class="row">
        <div class="col-sm-3">
          <div class="xe-widget xe-conversations box2 label-info"
               onclick="window.open('https://www.awwwards.com/', '_blank')" data-toggle="tooltip"
               data-placement="bottom" title="" data-original-title="https://www.awwwards.com/">
            <div class="xe-comment-entry">
              <a class="xe-user-img">
                <img data-src="../assets/images/logos/awwwards.png" class="lozad img-circle" width="40">
              </a>
              <div class="xe-comment">
                <a href="#" class="xe-user-name overflowClip_1">
                  <strong>Awwwards</strong>
                </a>
                <p class="overflowClip_2">Awwwards are the Website Awards that recognize and promote the
                  talent and effort of the best developers, designers and web agencies in the world.</p>
              </div>
            </div>
          </div>
        </div>
        <div class="col-sm-3">
          <div class="xe-widget xe-conversations box2 label-info"
               onclick="window.open('https://www.cssdesignawards.com/', '_blank')" data-toggle="tooltip"
               data-placement="bottom" title="" data-original-title="https://www.cssdesignawards.com/">
            <div class="xe-comment-entry">
              <a class="xe-user-img">
                <img data-src="../assets/images/logos/CSSDesignAwards.png" class="lozad img-circle"
                     width="40">
              </a>
              <div class="xe-comment">
                <a href="#" class="xe-user-name overflowClip_1">
                  <strong>CSS Design Awards</strong>
                </a>
                <p class="overflowClip_2">Website Awards & Inspiration - CSS Gallery</p>
              </div>
            </div>
          </div>
        </div>
        <div class="col-sm-3">
          <div class="xe-widget xe-conversations box2 label-info"
               onclick="window.open('https://thefwa.com/', '_blank')" data-toggle="tooltip"
               data-placement="bottom" title="" data-original-title="https://thefwa.com/">
            <div class="xe-comment-entry">
              <a class="xe-user-img">
                <img data-src="../assets/images/logos/fwa.png" class="lozad img-circle" width="40">
              </a>
              <div class="xe-comment">
                <a href="#" class="xe-user-name overflowClip_1">
                  <strong>The FWA</strong>
                </a>
                <p class="overflowClip_2">FWA - showcasing innovation every day since 2000</p>
              </div>
            </div>
          </div>
        </div>
        <div class="col-sm-3">
          <div class="xe-widget xe-conversations box2 label-info"
               onclick="window.open('http://www.ecommercefolio.com/', '_blank')" data-toggle="tooltip"
               data-placement="bottom" title="" data-original-title="http://www.ecommercefolio.com/">
            <div class="xe-comment-entry">
              <a class="xe-user-img">
                <img data-src="../assets/images/logos/Ecommercefolio.png" class="lozad img-circle"
                     width="40">
              </a>
              <div class="xe-comment">
                <a href="#" class="xe-user-name overflowClip_1">
                  <strong>Ecommercefolio</strong>
                </a>
                <p class="overflowClip_2">Only the Best Ecommerce Design Inspiration</p>
              </div>
            </div>
          </div>
        </div>
      </div>
      <br/>
      <!--END 常用工具 -->
      <!-- 学习教程 -->
      <h4 class="text-gray"><i class="linecons-tag" style="margin-right: 7px;" id="学习教程"></i><strong
          style="color: #eba0b3">学习教程</strong></h4>
      <div class="row">
        <div class="col-sm-3">
          <div class="xe-widget xe-conversations box2 label-info"
               onclick="window.open('https://www.iconfinder.com', '_blank')" data-toggle="tooltip"
               data-placement="bottom" title="" data-original-title="https://www.iconfinder.com">
            <div class="xe-comment-entry">
              <a class="xe-user-img">
                <img data-src="../assets/images/logos/Iconfinder.png" class="lozad img-circle" width="40">
              </a>
              <div class="xe-comment">
                <a href="#" class="xe-user-name overflowClip_1">
                  <strong>Iconfinder</strong>
                </a>
                <p class="overflowClip_2">2,100,000+ free and premium vector icons.</p>
              </div>
            </div>
          </div>
        </div>
        <div class="col-sm-3">
          <div class="xe-widget xe-conversations box2 label-info"
               onclick="window.open('http://www.iconfont.cn/', '_blank')" data-toggle="tooltip"
               data-placement="bottom" title="" data-original-title="http://www.iconfont.cn/">
            <div class="xe-comment-entry">
              <a class="xe-user-img">
                <img data-src="../assets/images/logos/iconfont.png" class="lozad img-circle" width="40">
              </a>
              <div class="xe-comment">
                <a href="#" class="xe-user-name overflowClip_1">
                  <strong>iconfont</strong>
                </a>
                <p class="overflowClip_2">阿里巴巴矢量图标库</p>
              </div>
            </div>
          </div>
        </div>
        <div class="col-sm-3">
          <div class="xe-widget xe-conversations box2 label-info"
               onclick="window.open('https://iconmonstr.com/', '_blank')" data-toggle="tooltip"
               data-placement="bottom" title="" data-original-title="https://iconmonstr.com/">
            <div class="xe-comment-entry">
              <a class="xe-user-img">
                <img data-src="../assets/images/logos/iconmonstr.png" class="lozad img-circle" width="40">
              </a>
              <div class="xe-comment">
                <a href="#" class="xe-user-name overflowClip_1">
                  <strong>iconmonstr</strong>
                </a>
                <p class="overflowClip_2">Free simple icons for your next project</p>
              </div>
            </div>
          </div>
        </div>
        <div class="col-sm-3">
          <div class="xe-widget xe-conversations box2 label-info"
               onclick="window.open('http://www.iconarchive.com/', '_blank')" data-toggle="tooltip"
               data-placement="bottom" title="" data-original-title="http://www.iconarchive.com/">
            <div class="xe-comment-entry">
              <a class="xe-user-img">
                <img data-src="../assets/images/logos/iconarchive.png" class="lozad img-circle" width="40">
              </a>
              <div class="xe-comment">
                <a href="#" class="xe-user-name overflowClip_1">
                  <strong>Icon Archive</strong>
                </a>
                <p class="overflowClip_2">Search 590,912 free icons</p>
              </div>
            </div>
          </div>
        </div>
      </div>
      <br/>
      <!--END 学习教程 -->
      <footer class="main-footer sticky footer-type-1">
        <div class="footer-inner">
          <div class="footer-text">
            &copy; 2022-2022
            <a href="../cn/about.html"><strong>AiYaLucky</strong></a> design by <a href="http://viggoz.com"
                                                                                   target="_blank"><strong>AiYaLucky</strong></a>
          </div>
          <div class="go-up">
            <a href="#" rel="go-top">
              <i class="fa-angle-up"></i>
            </a>
          </div>
        </div>
      </footer>
    </div>
  </div>
</template>

<script>

import HelloWorld from '@/components/HelloWorld.vue'

export default {
  name: 'HomeView',
  components: {
    HelloWorld
  }
}
</script>

<style>
.title, .tooltip-blue {
  font-size: 18px;
}
</style>
