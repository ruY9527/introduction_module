<template>
  <div class="container">
    <Search></Search>
    <UsersMain></UsersMain>
    <!--<users-main></users-main>-->
  </div>
</template>

<script>
  // 导入 vue 文件
  import Search from './components/Search.vue'
  import Main from './components/Main.vue'

  export default {
    // 使用导入进来的 vue 文件
    components: {
      Search,
      UsersMain: Main
    }
  }
</script>

<style>

</style>
