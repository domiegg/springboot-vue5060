import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Messages from '../pages/messages/list'
import Storeup from '../pages/storeup/list'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import payList from '../pages/pay'

import yonghuList from '../pages/yonghu/list'
import yonghuDetail from '../pages/yonghu/detail'
import yonghuAdd from '../pages/yonghu/add'
import chanpingleibieList from '../pages/chanpingleibie/list'
import chanpingleibieDetail from '../pages/chanpingleibie/detail'
import chanpingleibieAdd from '../pages/chanpingleibie/add'
import chanpingzhanshiList from '../pages/chanpingzhanshi/list'
import chanpingzhanshiDetail from '../pages/chanpingzhanshi/detail'
import chanpingzhanshiAdd from '../pages/chanpingzhanshi/add'
import newstypeList from '../pages/newstype/list'
import newstypeDetail from '../pages/newstype/detail'
import newstypeAdd from '../pages/newstype/add'
import Forum from '../pages/forum/list'
import ForumAdd from '../pages/forum/add'
import ForumDetail from '../pages/forum/detail'
import MyForumList from '../pages/forum/myForumList'
import discusschanpingzhanshiList from '../pages/discusschanpingzhanshi/list'
import discusschanpingzhanshiDetail from '../pages/discusschanpingzhanshi/detail'
import discusschanpingzhanshiAdd from '../pages/discusschanpingzhanshi/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'forum',
					component: Forum
				},
				{
					path: 'forumAdd',
					component: ForumAdd
				},
				{
					path: 'forumDetail',
					component: ForumDetail
				},
				{
					path: 'myForumList',
					component: MyForumList
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'pay',
					component: payList,
				},
				{
					path: 'messages',
					component: Messages
				},
				{
					path: 'storeup',
					component: Storeup
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'yonghu',
					component: yonghuList
				},
				{
					path: 'yonghuDetail',
					component: yonghuDetail
				},
				{
					path: 'yonghuAdd',
					component: yonghuAdd
				},
				{
					path: 'chanpingleibie',
					component: chanpingleibieList
				},
				{
					path: 'chanpingleibieDetail',
					component: chanpingleibieDetail
				},
				{
					path: 'chanpingleibieAdd',
					component: chanpingleibieAdd
				},
				{
					path: 'chanpingzhanshi',
					component: chanpingzhanshiList
				},
				{
					path: 'chanpingzhanshiDetail',
					component: chanpingzhanshiDetail
				},
				{
					path: 'chanpingzhanshiAdd',
					component: chanpingzhanshiAdd
				},
				{
					path: 'newstype',
					component: newstypeList
				},
				{
					path: 'newstypeDetail',
					component: newstypeDetail
				},
				{
					path: 'newstypeAdd',
					component: newstypeAdd
				},
				{
					path: 'discusschanpingzhanshi',
					component: discusschanpingzhanshiList
				},
				{
					path: 'discusschanpingzhanshiDetail',
					component: discusschanpingzhanshiDetail
				},
				{
					path: 'discusschanpingzhanshiAdd',
					component: discusschanpingzhanshiAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
