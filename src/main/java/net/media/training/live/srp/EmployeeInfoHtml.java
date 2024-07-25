package net.media.training.live.srp;

public class EmployeeInfoHtml{
    public String InfoHtml(Employee employee) {
        String employeeInfo = "<div>" +
                "<h1>Employee Info</h1>" +
                "<div id='emp" + employee.empId + "'>" +
                "<span>" + employee.name + "</span>" +
                "<div class='left'>" +
                "<span>Leave Left :</span>" +
                "<span>Annual Salary:</span>" +
                "<span>Manager:</span>" +
                "<span>Reimbursable Leave:</span>" +
                "</div>";
        employeeInfo += "<div class='right'><span>" + (employee.totalLeaveAllowed - employee.leaveTaken) + "</span>";
        employeeInfo += "<span>" + Math.round(employee.monthlySalary * 12) + "</span>";
        if (employee.manager != null) employeeInfo += "<span>" + employee.manager + "</span>";
        else employeeInfo += "<span>None</span>";
        int years = 3;
        if (employee.yearsInOrg < 3) {
            years = employee.yearsInOrg;
        }
        int totalLeaveLeftPreviously = 0;
        for (int i = 0; i < years; i++) {
            totalLeaveLeftPreviously += employee.leavesLeftPreviously[employee.yearsInOrg-i-1];
        }
        employeeInfo += "<span>" + employee.totalLeaveLeftPreviously + "</span>";
        return employeeInfo + "</div> </div>";
    }
}