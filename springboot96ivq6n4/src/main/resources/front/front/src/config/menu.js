const menu = {
    list() {
        return [{
            "backMenu": [{
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除"],
                    "appFrontIcon": "cuIcon-paint",
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "用户",
                    "menuJump": "列表",
                    "tableName": "yonghu"
                }],
                "menu": "用户管理"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除"],
                    "appFrontIcon": "cuIcon-shop",
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "产品类别",
                    "menuJump": "列表",
                    "tableName": "chanpingleibie"
                }],
                "menu": "产品类别管理"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "查看评论"],
                    "appFrontIcon": "cuIcon-shop",
                    "buttons": ["查看", "修改", "删除"],
                    "menu": "产品展示",
                    "menuJump": "列表",
                    "tableName": "chanpingzhanshi"
                }],
                "menu": "产品展示管理"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除"],
                    "appFrontIcon": "cuIcon-group",
                    "buttons": ["查看", "修改", "删除"],
                    "menu": "交流中心",
                    "tableName": "forum"
                }],
                "menu": "交流中心"
            }, {
                "child": [{
                    "allButtons": ["查看", "修改", "回复", "删除"],
                    "appFrontIcon": "cuIcon-message",
                    "buttons": ["查看", "修改", "回复", "删除"],
                    "menu": "问题反馈",
                    "tableName": "messages"
                }],
                "menu": "问题反馈"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除"],
                    "appFrontIcon": "cuIcon-news",
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "资讯信息",
                    "tableName": "news"
                }, {
                    "allButtons": ["新增", "查看", "修改", "删除"],
                    "appFrontIcon": "cuIcon-news",
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "资讯信息分类",
                    "tableName": "newstype"
                }, {
                    "allButtons": ["新增", "查看", "修改", "删除"],
                    "appFrontIcon": "cuIcon-time",
                    "buttons": ["查看", "修改", "删除"],
                    "menu": "轮播图管理",
                    "tableName": "config"
                }],
                "menu": "系统管理"
            }],
            "frontMenu": [{
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "查看评论"],
                    "appFrontIcon": "cuIcon-medal",
                    "buttons": ["查看"],
                    "menu": "产品展示列表",
                    "menuJump": "列表",
                    "tableName": "chanpingzhanshi"
                }],
                "menu": "产品展示模块"
            }],
            "hasBackLogin": "是",
            "hasBackRegister": "否",
            "hasFrontLogin": "否",
            "hasFrontRegister": "否",
            "roleName": "管理员",
            "tableName": "users"
        }, {
            "backMenu": [{
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "查看评论"],
                    "appFrontIcon": "cuIcon-shop",
                    "buttons": ["新增", "查看", "修改", "删除", "查看评论"],
                    "menu": "产品展示",
                    "menuJump": "列表",
                    "tableName": "chanpingzhanshi"
                }],
                "menu": "产品展示管理"
            }],
            "frontMenu": [{
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "查看评论"],
                    "appFrontIcon": "cuIcon-medal",
                    "buttons": ["查看"],
                    "menu": "产品展示列表",
                    "menuJump": "列表",
                    "tableName": "chanpingzhanshi"
                }],
                "menu": "产品展示模块"
            }],
            "hasBackLogin": "是",
            "hasBackRegister": "否",
            "hasFrontLogin": "是",
            "hasFrontRegister": "是",
            "roleName": "用户",
            "tableName": "yonghu"
        }]
    }
}
export default menu;
