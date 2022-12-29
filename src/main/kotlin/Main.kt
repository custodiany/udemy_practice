fun main(args: Array<String>) {
    println("이름을 넣어주세요!")
    val name = readLine()
    println("""
        감사합니다. 반갑습니다, $name 님.
        원하시는 카테고리를 입력해주세요.
    """.trimIndent())
}