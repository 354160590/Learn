package com.example.config;

import freemarker.template.TemplateExceptionHandler;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @Author LYF
 * @Description //TODO 自动生成代码Controller,service,serviceImpl
 * @Date 22:12 2019/4/23
 * @Param 
 * @return 
 **/
public class AutoCode {
    
    public static void main(String[] args) {
//        genCode("输入表名","输入自定义Model名称");
        genCode("base_config","base");
    }
    /**
     * 基础路径
     **/
    private static final String BASE_SRC="/com/example/";
    /**
     * 模块名称
     */
    static final String MODULE_NAME = "base";
    /**
     * 模块路径
     */
    static final String MODULE_DIR = "";
    /**
     * 基础包
     **/
    public static final String BASE="com.example.";
    /**
     * 模块基础路径
     */
    public static final String BASE_PACKAGE = BASE+ AutoCode.MODULE_NAME;

    /**
     * 生成的Service存放路径
     */
    private static final String PACKAGE_PATH_SERVICE = BASE_SRC+ AutoCode.MODULE_NAME + "/service/";
    /**
     * 生成的Service实现存放路径
     */
    private static final String PACKAGE_PATH_SERVICE_IMPL =BASE_SRC + AutoCode.MODULE_NAME + "/service/impl/";
    /**
     * 生成的Controller存放路径
     */
    private static final String PACKAGE_PATH_CONTROLLER = BASE_SRC+ AutoCode.MODULE_NAME + "/controller/";
    /**
     * 项目在硬盘上的基础路径
     */
    private static final String PROJECT_PATH = System.getProperty("user.dir");
    /**
     * 模板位置
     */
    private static final String TEMPLATE_FILE_PATH = PROJECT_PATH + "/src/main/resources/generatorTemplate";
    /**
     * java文件路径
     */
    private static final String JAVA_PATH = MODULE_DIR + "/src/main/java/";
    /**
     * 资源文件路径
     */
    private static final String RESOURCES_PATH = MODULE_DIR + "/src/main/resources";

    /**
     * 作者
     **/
    private static final String AUTHOR = "Mr.LYF";
    /**
     * 创建日期
     **/
    private static final String DATE = new SimpleDateFormat("yyyy/MM/dd").format(new Date());


    /**
     * @Author LYF
     * @Description //TODO 根据表明及模块名生成代码
     * @Date 22:14 2019/4/23
     * @Param [tableName, modelName] [数据表名称,自定义的 Model 名称]
     * @return void
     **/
    public static void genCode(String tableName, String modelName) {
        //文件路径
        File file1 = new File(PROJECT_PATH + JAVA_PATH);
        //资源位置
        File file2 = new File(PROJECT_PATH + RESOURCES_PATH);
        if (!file1.getAbsoluteFile().exists()) {
            file1.getAbsoluteFile().mkdirs();
        }
        if (!file2.getAbsoluteFile().exists()) {
            file2.getAbsoluteFile().mkdirs();
        }
        //表明分割，例如：base_usertest，实体：Usertest
        String[] split = tableName.split("_");
        String tableLastName = split[1];
        genService(tableLastName, modelName);
        genController(tableLastName, modelName);
    }

    /**
     * @Author LYF
     * @Description //TODO 生成service serviceImpl
     * @Date 22:14 2019/4/23
     * @Param [tableName, modelName]
     * @return void
     **/
    public static void genService(String tableName, String modelName) {
        try {
            freemarker.template.Configuration cfg = getConfiguration();

            String lowerClassName=tableName;
            String upperClassName = firstToCapital(tableName);

            Map<String, Object> data = new HashMap<>();
            data.put("date", DATE);
            data.put("author", AUTHOR);
            //模块名称
            // data.put("modelName", MODULE_NAME);
            //包名
            data.put("basePackage", AutoCode.BASE_PACKAGE);
            //实体名，首字母大写
            data.put("upperClassName", upperClassName);
            //实体名，首字母小写
            data.put("lowerClassName", lowerClassName);
            File file = new File(PROJECT_PATH + JAVA_PATH + PACKAGE_PATH_SERVICE + upperClassName + "Service.java");
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            cfg.getTemplate("service.ftl").process(data,new FileWriter(file));
            System.out.println(upperClassName + "Service.java 生成成功");

            File file1 = new File(PROJECT_PATH + JAVA_PATH + PACKAGE_PATH_SERVICE_IMPL + upperClassName + "ServiceImpl.java");
            if (!file1.getParentFile().exists()) {
                file1.getParentFile().mkdirs();
            }
            cfg.getTemplate("serviceimpl.ftl").process(data,new FileWriter(file1));
            System.out.println(upperClassName + "ServiceImpl.java 生成成功");
        } catch (Exception e) {
            throw new RuntimeException("生成Service失败", e);
        }
    }

    /**
     * @Author LYF
     * @Description //TODO 生成controller
     * @Date 22:13 2019/4/23
     * @Param [tableName, modelName]
     * @return void
     **/
    public static void genController(String tableName, String modelName) {
        try {
            freemarker.template.Configuration cfg = getConfiguration();

            String lowerClassName=tableName;
            String upperClassName = firstToCapital(tableName);

            Map<String, Object> data = new HashMap<>();
            data.put("date", DATE);
            data.put("author", AUTHOR);
            //模块名称
            // data.put("modelName", MODULE_NAME);
            //包名
            data.put("basePackage", AutoCode.BASE_PACKAGE);
            //实体名，首字母大写
            data.put("upperClassName", upperClassName);
            //实体名，首字母小写
            data.put("lowerClassName", lowerClassName);
            File file = new File(PROJECT_PATH + JAVA_PATH + PACKAGE_PATH_CONTROLLER + upperClassName + "Controller.java");
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            cfg.getTemplate("controller.ftl").process(data, new FileWriter(file));
            System.out.println(upperClassName + "Controller.java 生成成功");
        } catch (Exception e) {
            throw new RuntimeException("生成Controller失败", e);
        }

    }
    private static freemarker.template.Configuration getConfiguration() throws IOException {
        freemarker.template.Configuration cfg = new freemarker.template.Configuration(freemarker.template.Configuration.VERSION_2_3_23);
        cfg.setDirectoryForTemplateLoading(new File(TEMPLATE_FILE_PATH));
        cfg.setDefaultEncoding("UTF-8");
        cfg.setTemplateExceptionHandler(TemplateExceptionHandler.IGNORE_HANDLER);
        return cfg;
    }
    private static String tableNameConvertMappingPath(String tableName) {
        //兼容使用大写的表名
        tableName = tableName.toLowerCase();
        return "/" + (tableName.contains("_") ? tableName.replaceAll("_", "/") : tableName);
    }

    //首字母大写
    private static String firstToCapital(String str){
        char[] chars = str.toCharArray();
        if (chars[0] >= 'a' && chars[0] <= 'z') {
            chars[0] = (char)(chars[0] - 32);
        }
        return new String(chars);
    }
}
