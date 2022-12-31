fun main(args: Array<String>) {
    println("이름을 넣어주세요!")
    val name = readLine()
    println("""
        감사합니다. 반갑습니다, $name 님.
        원하시는 카테고리를 입력해주세요.
    """.trimIndent())

    /*1. 상품 카테고리 표기
      2. 사용자 입력 받기
      3. 사용자가 기대하지 않는 값을 입력했을 시 처리*/

    val categories = arrayOf("전자제품", "패션", "반려동물용품")
    for (category in categories){
        println(category)
    }
    println("=> 장바구니로 이동하려면 #을 입력하세요.")
    //==================Step2=======================
    var selectedCategory = readLine()
    while(selectedCategory.isNullOrBlank()){
        println("값을 입력해주세요.")
        selectedCategory = readLine()
    }
    //Step3
    if (selectedCategory == "#") {
        //TODO 1. 장바구니 페이지 출력하기
    }else {
        //TODO 2. 각 카테고리 상품 보여주기
        //TODO 3. 카테고리 목록에 없는 입력값 받을 시 처리하기
    }
}