package com.example.demobootjsp;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 독립적인 WAR 파일로 실행할 때는 DemoBootJspApplication 클래스를 사용한다.
 * Tomcat 등의 서블릿 엔진에 배포를 하는 형태로 사용할 때는 ServletInitializer 클래스를 사용한다.
 *
 * WAR 패키징으로 스프링 부트 프로젝트를 생성하면 이렇게 ServletInitializer가 하나 더 추가되어 있다
 * 애플리케이션을 패키징한 뒤 독립적인 JAR로 실행할 수는 있다 (java -jar target/*.war)
 * 이 클래스가 있는 WAR 파일이기 때문에 웹 서버에 배포할 수도 있다(Tomcat에 배포해서 실행할 수 있다)
 *
 */
public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DemoBootJspApplication.class);
    }

}
