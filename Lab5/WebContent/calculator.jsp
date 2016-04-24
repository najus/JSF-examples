<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>JSP Page</title>
        </head>
        <body>
           <h:form>
               First Number: <h:inputText value="#{CalculatorJSF.firstNumber}"></h:inputText>
                <br>
                Second Number: <h:inputText value="#{CalculatorJSF.secondNumber}"></h:inputText>
                <br>
                <br>
                <h:commandButton value="Add" action="#{CalculatorJSF.add}"></h:commandButton> &nbsp;&nbsp;
                <h:commandButton value="Subtract" action="#{CalculatorJSF.subtract}"></h:commandButton> &nbsp;&nbsp;
                <h:commandButton value="Multiply" action="#{CalculatorJSF.multiply}"></h:commandButton> &nbsp;&nbsp;
                <h:commandButton value="Divide" action="#{CalculatorJSF.divide}"></h:commandButton>
                <br>
                Result:&nbsp;<h:outputText value="#{CalculatorJSF.result}"></h:outputText>
            </h:form>
        </body>
    </html>
</f:view>
