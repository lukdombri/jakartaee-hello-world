FROM quay.io/wildfly/wildfly
COPY target/jakartaee-demo.war /opt/jboss/wildfly/standalone/deployments/
