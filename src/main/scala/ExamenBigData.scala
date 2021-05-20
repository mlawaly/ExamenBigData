object ExamenBigData {
  def main(args: Array[String]): Unit = {
    println("Fonction principale")
    val l1 : List[String] = List("julien", "Paul", "jean", "rac", "trec", "joel", "ed", "chris", "maurice")
    println(renvoiListe(l1))
  }

  def renvoiListe(list : List[String]): List[String] = {
    val list2 = list.filter(s => (s.charAt(s.length-1) == 'n'))
    return list2
  }



}
