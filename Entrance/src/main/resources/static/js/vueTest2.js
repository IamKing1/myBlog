// 定义名为 todo-item 的新组件
// Vue.component('todo-item', {
//     template: '<li>这是个待办项</li>'
// });

// var app = new Vue({
//     el : "#app",
//     data : {
//
//    }
// });
import axios from 'axios';
Vue.component('todo-item', {
    // todo-item 组件现在接受一个
    // "prop"，类似于一个自定义 attribute。
    // 这个 prop 名为 todo。
    props: ['todo'],
    template: '<li>{{ todo.text }}</li>'
});

var app = new Vue({
    el : "#app",
    data : {
        groceryList: [
            { id: 1, text: '蔬菜' },
            { id: 0, text: '奶酪' },
            { id: 2, text: '随便其它什么人吃的东西' }
        ]
   }
});


Vue.prototype.$axios = axios;
var app1 = new Vue({
    el : "#app1",
    template: '<div>{{ message }} <hr> 返回数据 {{data}} <hr> <button @click=getData>点击</button></div>',
    data: function () {
        return{
            message: 'Hello World',
            data: '',
            id: '1'
        }
      },
    methods: {
        getData: function () {
            var myBody = this;
            axios({

            })

        }
    }
});