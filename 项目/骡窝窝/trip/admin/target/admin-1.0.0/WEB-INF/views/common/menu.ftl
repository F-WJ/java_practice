<ul id="menu" class="list-group">
    <li class="list-group-item">
        <a href="#" data-toggle="collapse" data-target="#strategy_detail">
            <span>攻略管理</span>
        </a>
        <ul class="in" id="strategy_detail">
            <li class="strategy"><a href="/strategy/list.do">大攻略管理</a></li>
            <li class="strategyCatalog"><a href="/strategyCatalog/list.do">攻略分类管理</a></li>
            <li class="strategyDetail"><a href="/strategyDetail/list.do">攻略文章管理</a></li>
        </ul>
    </li>
    <li class="list-group-item">
        <a href="#" data-toggle="collapse" data-target="#travel_detail">
            <span>游记管理</span>
        </a>
        <ul class="in" id="travel_detail">
            <li class="releaseList"><a href="/travel/releaseList.do">已发布游记管理</a></li>
            <li class="travel"><a href="/travel/list.do">待审核游记</a></li>
            <li class="travelCommend"><a href="/travelCommend/list.do">游记推荐设置</a></li>
        </ul>
    </li>
    <li class="list-group-item">
        <a href="#" data-toggle="collapse" data-target="#system_detail">
            <span>平台管理</span>
        </a>
        <ul class="in" id="system_detail">
            <li class="user"><a href="/user/list.do">注册用户管理</a></li>
            <li class="region"><a href="/region/list.do">旅游地区管理</a></li>
        </ul>
    </li>
</ul>

<!--设置菜单回显-->
<script>
    $(".in li.${currentMenu}").addClass("active");
</script>