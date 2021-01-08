#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")
public enum ${NAME} {

    private final String val;
    
    ${NAME}(final String val) {
        this.val = val;
    }
    
    public String getVal() {
        return this.val;
    }
}
