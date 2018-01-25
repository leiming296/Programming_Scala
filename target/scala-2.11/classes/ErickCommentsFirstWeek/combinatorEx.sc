
case class Employee (
    name: String,
    titile: String,
    annualsalary: Double,
    taxRate: Double,
    insurancePermiumsPerweek: Double
)

val employees = List(
  Employee("Buck Trends", "CEO", 20000, 0.25, 100.0),
  Employee("Cindy Banks", "CFO", 17000, 0.22, 120.0),
  Employee("Joe Coder", "Developer", 130000, 0.20, 120.0)
)

// Calculate weekly payroll
val netPay = employees map {e =>
   val net = (1.0 - e.taxRate)*(e.annualsalary/52.0)-
  e.insurancePermiumsPerweek
  (e, net)
}

// print paychecks
println("**paychecks:")
netPay foreach {
  // case(e, net) => println(f"${e.name+ ':'} + ${net}%10.2f")
  case (e, net) => println(f"  ${e.name+':'}%-16s ${net}%10.2f")
}

// generate report

val report = (netPay foldLeft (0.0, 0.0, 0.0)) {
  case((totalSalary, totalNet, totalInsurance), (e, net)) =>
    ( totalSalary + e.annualsalary/52,  totalNet + net, totalInsurance + e.insurancePermiumsPerweek)
}

println("\n** Report:")
println(f"Total Salary: ${report._1}%10.2f")
println(f"Total Net: ${report._2}%10.2f")
println(f" Total Insurance: ${report._3}%10.2f")