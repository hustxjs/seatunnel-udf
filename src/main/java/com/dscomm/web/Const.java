package com.dscomm.web;


import com.dscomm.dao.impl.AccountDaoImpl;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

public class Const {

    public static final int nSource_HttpReq   = 1;//表示来源是http请求
    public static final int nSource_TimeTask  = 2;//表示来源是定时任务

    public static final int Cat_Shiju       = 1;   //市局
    public static final int Cat_fenju       = 2;   //分局
    public static final int Cat_PaiChuSuo   = 3;   //派出所
    public static final int Cat_ShengTing   = 4;   //省厅

    public Set<String> shijuSet = new HashSet<>();
    public InputStream inputStream = null;
    public Properties properties = new Properties();
    public static String client_lx = "";

    public Const(){
        try {
            if ( inputStream == null ) {
                inputStream = Const.class.getResourceAsStream("/spark-config.properties");
                properties.load(new InputStreamReader(inputStream, "UTF-8"));

                client_lx = properties.getProperty("client_lx");
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public String get_client_lx() {
        String client_lx = properties.getProperty("client_lx");

//        Const cn = new Const();
//        System.out.println( cn.client_lx);


        return client_lx;
    }


    public static void main(String[] args) throws Exception {
//        Const cn = new Const();
//        System.out.println( cn.client_lx);
    }



    public static String jinqing_info = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "\n" +
            "<MESSAGE> \n" +
            "  <DATASET name=\"ZA_DATA_INDEX\" rmk=\"数据文件索引信息\"> \n" +
            "    <DATA> \n" +
            "      <DATASET name=\"ZA_DATA_FORMAT\" rmk=\"数据文件格式信息\"> \n" +
            "        <DATA> \n" +
            "          <ITEM key=\"lfgf\" val=\"\\t\" rmk=\"列分隔符\"/>  \n" +
            "          <ITEM key=\"hfgf\" val=\"\\n\" rmk=\"行分隔符\"/>  \n" +
            "          <ITEM key=\"xxzybsf\" val=\"130400-117070302-1-1\" rmk=\"信息资源标识符\"/>  \n" +
            "          <ITEM key=\"sjqsh\" val=\"1\" rmk=\"数据起始行\"/>  \n" +
            "          <ITEM key=\"wjbmgs\" val=\"UTF-8\" rmk=\"文件编码格式\"/>  \n" +
            "          <DATASET name=\"ZA_DATA_FILE\" rmk=\"数据文件信息\"> \n" +
            "            <DATA> \n" +
            "              <ITEM key=\"wjlj\" val=\"\" rmk=\"文件路径\"/>  \n" +
            "              <ITEM key=\"wjm\" val=\"bcp_filename.bcp\" rmk=\"文件名\"/>  \n" +
            "               <ITEM key=\"jlhs\" val=\"line_count\" rmk=\"记录行数\"/> \n" +
            "            </DATA> \n" +
            "          </DATASET>  \n" +
            "          <DATASET name=\"ZA_DATA_STRUCT\" rmk=\"文件数据结构\"> \n" +
            "            <DATA> \n" +
            "              <ITEM key=\"JQDXBS\" chn=\"警情对象标识\" rmk=\"\" isFmt=\"\" isFile=\"\"/>                                 \n" +
            "              <ITEM key=\"JQBH\" chn=\"警情编号\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "              <ITEM key=\"MC\" chn=\"名称\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "              <ITEM key=\"JQLYDM\" chn=\"警情来源代码\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "              <ITEM key=\"JQJBDM\" chn=\"警情级别代码\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "              <ITEM key=\"ASJFSKSSJ\" chn=\"案事件发生开始时间\" rmk=\"\" isFmt=\"\" isFile=\"\"/>\n" +
            "              <ITEM key=\"XFJQLBDM\" chn=\"巡防警情类别代码\" rmk=\"\" isFmt=\"\" isFile=\"\"/>\t\t\t  \n" +
            "              <ITEM key=\"AFCSLXDM\" chn=\"案发场所类型代码\" rmk=\"\" isFmt=\"\" isFile=\"\"/>\n" +
            "\t\t\t  <ITEM key=\"SACSLBDM\" chn=\"涉案场所类别代码\" rmk=\"\" isFmt=\"\" isFile=\"\"/> \n" +
            "\t\t\t  <ITEM key=\"SACS_DZMC\" chn=\"涉案场所地址名称\" rmk=\"\" isFmt=\"\" isFile=\"\"/> \n" +
            "\t\t\t  <ITEM key=\"SACS_DQJD\" chn=\"涉案场所地球经度\" rmk=\"\" isFmt=\"\" isFile=\"\"/> \n" +
            "\t\t\t  <ITEM key=\"SACS_DQWD\" chn=\"涉案场所地球纬度\" rmk=\"\" isFmt=\"\" isFile=\"\"/> \n" +
            "\t\t\t  <ITEM key=\"AY\" chn=\"案由\" rmk=\"\" isFmt=\"\" isFile=\"\"/> \n" +
            "\t\t\t  <ITEM key=\"GAJGJGDM\" chn=\"公安机关机构代码\" rmk=\"\" isFmt=\"\" isFile=\"\"/> \n" +
            "\t\t\t  <ITEM key=\"BJSJ\" chn=\"报警时间\" rmk=\"\" isFmt=\"\" isFile=\"\"/> \n" +
            "\t\t\t  <ITEM key=\"BJR_XM\" chn=\"报警人姓名\" rmk=\"\" isFmt=\"\" isFile=\"\"/> \n" +
            "\t\t\t  <ITEM key=\"BJR_LXDH\" chn=\"报警人联系电话\" rmk=\"\" isFmt=\"\" isFile=\"\"/> \n" +
            "\t\t\t  <ITEM key=\"HLAJ_HLYY\" chn=\"忽略案件忽略原因\" rmk=\"\" isFmt=\"\" isFile=\"\"/> \n" +
            "\t\t\t  <ITEM key=\"HLAJ_RQSJ\" chn=\"忽略案件日期时间\" rmk=\"\" isFmt=\"\" isFile=\"\"/> \n" +
            "\t\t\t  <ITEM key=\"CLR_XM\" chn=\"处理人姓名\" rmk=\"\" isFmt=\"\" isFile=\"\"/> \n" +
            "\t\t\t  <ITEM key=\"CLR_JJSJ\" chn=\"处理人接警时间\" rmk=\"\" isFmt=\"\" isFile=\"\"/> \n" +
            "\t\t\t  <ITEM key=\"CLR_DDSJ\" chn=\"处理人到达时间\" rmk=\"\" isFmt=\"\" isFile=\"\"/> \n" +
            "\t\t\t  <ITEM key=\"CHL_CLSJ\" chn=\"处理_处理时间\" rmk=\"\" isFmt=\"\" isFile=\"\"/> \n" +
            "\t\t\t  <ITEM key=\"CHL_JGCLJGDM\" chn=\"处理_警情处理结果代码\" rmk=\"\" isFmt=\"\" isFile=\"\"/> \n" +
            "\t\t\t  <ITEM key=\"TPSJ\" chn=\"图片数据\" rmk=\"\" isFmt=\"\" isFile=\"\"/> \n" +
            "\t\t\t  <ITEM key=\"TPURL\" chn=\"图片URL\" rmk=\"\" isFmt=\"\" isFile=\"\"/> \n" +
            "\t\t\t  <ITEM key=\"SPSJ\" chn=\"视频数据\" rmk=\"\" isFmt=\"\" isFile=\"\"/> \n" +
            "\t\t\t  <ITEM key=\"SPURL\" chn=\"视频URL\" rmk=\"\" isFmt=\"\" isFile=\"\"/> \n" +
            "\t\t\t  <ITEM key=\"SJLY_XZQHDM\" chn=\"数据来源_行政区划代码\" rmk=\"\" isFmt=\"\" isFile=\"\"/> \n" +
            "\t\t\t  <ITEM key=\"SJGXSM\" chn=\"数据更新说明\" rmk=\"\" isFmt=\"\" isFile=\"\"/> \n" +
            "\t\t\t  <ITEM key=\"SJGSDWDM\" chn=\"数据归属单位代码\" rmk=\"\" isFmt=\"\" isFile=\"\"/> \n" +
            "\t\t\t  <ITEM key=\"SJGSDWMC\" chn=\"数据归属单位名称\" rmk=\"\" isFmt=\"\" isFile=\"\"/> \n" +
            "            </DATA> \n" +
            "          </DATASET> \n" +
            "        </DATA> \n" +
            "      </DATASET> \n" +
            "    </DATA> \n" +
            "  </DATASET> \n" +
            "</MESSAGE>";

    //盘查非机动车信息
    public static String pancha_noche_info = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<MESSAGE>\n" +
            "\t<DATASET name=\"ZA_DATA_INDEX\" rmk=\"数据文件索引信息\">\n" +
            "\t\t<DATA>\n" +
            "\t\t\t<DATASET name=\"ZA_DATA_FORMAT\" rmk=\"数据文件格式信息\">\n" +
            "\t\t\t\t<DATA>\n" +
            "\t\t\t\t\t<ITEM key=\"lfgf\" val=\"\\t\" rmk=\"列分隔符\"/>\n" +
            "\t\t\t\t\t<ITEM key=\"hfgf\" val=\"\\n\" rmk=\"行分隔符\"/>\n" +
            "\t\t\t\t\t<ITEM key=\"xxzybsf\" val=\"130400-117070203-1-1\" rmk=\"信息资源标识符\"/>\n" +
            "\t\t\t\t\t<ITEM key=\"sjqsh\" val=\"1\" rmk=\"数据起始行\"/>\n" +
            "\t\t\t\t\t<ITEM key=\"wjbmgs\" val=\"UTF-8\" rmk=\"文件编码格式\"/>\n" +
            "\t\t\t\t\t<DATASET name=\"ZA_DATA_FILE\" rmk=\"数据文件信息\">\n" +
            "\t\t\t\t\t\t<DATA>\n" +
            "\t\t\t\t\t\t\t<ITEM key=\"wjlj\" val=\"/\" rmk=\"文件路径\"/>\n" +
            "\t\t\t\t\t\t\t<ITEM key=\"wjm\" val=\"bcp_filename.bcp\" rmk=\"文件名\"/>\n" +
            "\t\t\t\t\t\t\t<ITEM key=\"jlhs\" val=\"line_count\" rmk=\"记录行数\"/>\n" +
            "\t\t\t\t\t\t</DATA>\n" +
            "\t\t\t\t\t</DATASET>\n" +
            "\t\t\t\t\t<DATASET name=\"ZA_DATA_STRUCT\" rmk=\"文件数据结构\">\n" +
            "\t\t\t\t\t\t<DATA>\n" +
            "\t\t\t\t\t\t\t<ITEM key=\"pcfjdcdxbs\" chn=\"盘查非机动车对象标识\" rmk=\"\" isFmt=\"\" isFile=\"\"/>\n" +
            "\t\t\t\t\t\t\t<ITEM key=\"pcjldxbs\" chn=\"盘查记录对象标识\" rmk=\"\" isFmt=\"\" isFile=\"\"/>\n" +
            "\t\t\t\t\t\t\t<ITEM key=\"pcrybs\" chn=\"盘查人员对象标识\" rmk=\"\" isFmt=\"\" isFile=\"\"/>\n" +
            "\t\t\t\t\t\t\t<ITEM key=\"pczpdxbs\" chn=\"盘查照片对象标识\" rmk=\"\" isFmt=\"\" isFile=\"\"/>\n" +
            "\t\t\t\t\t\t\t<ITEM key=\"pcspdxbs\" chn=\"盘查视频对象标识\" rmk=\"\" isFmt=\"\" isFile=\"\"/>\n" +
            "\t\t\t\t\t\t\t<ITEM key=\"fjdchphm\" chn=\"非机动车号牌号码\" rmk=\"\" isFmt=\"\" isFile=\"\"/>\n" +
            "\t\t\t\t\t\t\t<ITEM key=\"pcyy\" chn=\"盘查原因\" rmk=\"\" isFmt=\"\" isFile=\"\"/>\n" +
            "\t\t\t\t\t\t\t<ITEM key=\"pccljgdm\" chn=\"盘查处理结果代码\" rmk=\"\" isFmt=\"\" isFile=\"\"/>\n" +
            "\t\t\t\t\t\t\t<ITEM key=\"cjsj\" chn=\"采集时间\" rmk=\"\" isFmt=\"\" isFile=\"\"/>\n" +
            "\t\t\t\t\t\t\t<ITEM key=\"cjmj_jybh\" chn=\"采集民警警员编号\" rmk=\"\" isFmt=\"\" isFile=\"\"/>\n" +
            "\t\t\t\t\t\t\t<ITEM key=\"cjmj_gajgbmlbdm\" chn=\"采集民警公安机关部门类别代码\" rmk=\"\" isFmt=\"\" isFile=\"\"/>\n" +
            "\t\t\t\t\t\t\t<ITEM key=\"cjmj_gmsfhm\" chn=\"采集民警公民身份号码\" rmk=\"\" isFmt=\"\" isFile=\"\"/>\n" +
            "\t\t\t\t\t\t\t<ITEM key=\"xfsjlydm\" chn=\"巡防数据来源代码\" rmk=\"\" isFmt=\"\" isFile=\"\"/>\n" +
            "\t\t\t\t\t\t\t<ITEM key=\"sjtbsj\" chn=\"数据同步时间\" rmk=\"\" isFmt=\"\" isFile=\"\"/>\n" +
            "\t\t\t\t\t\t\t<ITEM key=\"sjgxsm\" chn=\"数据更新说明\" rmk=\"\" isFmt=\"\" isFile=\"\"/>\n" +
            "\t\t\t\t\t\t\t<ITEM key=\"sjgsdwdm\" chn=\"数据归属单位代码\" rmk=\"\" isFmt=\"\" isFile=\"\"/>\n" +
            "\t\t\t\t\t\t\t<ITEM key=\"sjgsdwmc\" chn=\"数据归属单位名称\" rmk=\"\" isFmt=\"\" isFile=\"\"/>\n" +
            "\t\t\t\t\t\t</DATA>\n" +
            "\t\t\t\t\t</DATASET>\n" +
            "\t\t\t\t</DATA>\n" +
            "\t\t\t</DATASET>\n" +
            "\t\t</DATA>\n" +
            "\t</DATASET>\n" +
            "</MESSAGE>\n" +
            "\n" +
            "\n" +
            "\n";

    //盘查机动车信息
    public static String pancha_che_info = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<MESSAGE>\n" +
            "\t<DATASET name=\"ZA_DATA_INDEX\" rmk=\"数据文件索引信息\">\n" +
            "\t\t<DATA>\n" +
            "\t\t\t<DATASET name=\"ZA_DATA_FORMAT\" rmk=\"数据文件格式信息\">\n" +
            "\t\t\t\t<DATA>\n" +
            "\t\t\t\t\t<ITEM key=\"lfgf\" val=\"\\t\" rmk=\"列分隔符\"/>\n" +
            "\t\t\t\t\t<ITEM key=\"hfgf\" val=\"\\n\" rmk=\"行分隔符\"/>\n" +
            "\t\t\t\t\t<ITEM key=\"xxzybsf\" val=\"130400-117070202-1-1\" rmk=\"信息资源标识符\"/>\n" +
            "\t\t\t\t\t<ITEM key=\"sjqsh\" val=\"1\" rmk=\"数据起始行\"/>\n" +
            "\t\t\t\t\t<ITEM key=\"wjbmgs\" val=\"UTF-8\" rmk=\"文件编码格式\"/>\n" +
            "\t\t\t\t\t<DATASET name=\"ZA_DATA_FILE\" rmk=\"数据文件信息\">\n" +
            "\t\t\t\t\t\t<DATA>\n" +
            "\t\t\t\t\t\t\t<ITEM key=\"wjlj\" val=\"/\" rmk=\"文件路径\"/>\n" +
            "\t\t\t\t\t\t\t<ITEM key=\"wjm\" val=\"bcp_filename.bcp\" rmk=\"文件名\"/>\n" +
            "\t\t\t\t\t\t\t<ITEM key=\"jlhs\" val=\"line_count\" rmk=\"记录行数\"/>\n" +
            "\t\t\t\t\t\t</DATA>\n" +
            "\t\t\t\t\t</DATASET>\n" +
            "\t\t\t\t\t<DATASET name=\"ZA_DATA_STRUCT\" rmk=\"文件数据结构\">\n" +
            "\t\t\t\t\t\t<DATA>\n" +
            "\t\t\t\t\t\t\t<ITEM key=\"pcjdcdxbs\" chn=\"盘查机动车对象标识\" rmk=\"\" isFmt=\"\" isFile=\"\"/>\n" +
            "\t\t\t\t\t\t\t<ITEM key=\"pcjldxbs\" chn=\"盘查记录对象标识\" rmk=\"\" isFmt=\"\" isFile=\"\"/>\n" +
            "\t\t\t\t\t\t\t<ITEM key=\"pcrybs\" chn=\"盘查人员对象标识\" rmk=\"\" isFmt=\"\" isFile=\"\"/>\n" +
            "\t\t\t\t\t\t\t<ITEM key=\"jdchphm\" chn=\"机动车号牌号码\" rmk=\"\" isFmt=\"\" isFile=\"\"/>\n" +
            "\t\t\t\t\t\t\t<ITEM key=\"zwppdm\" chn=\"车辆品牌代码\" rmk=\"\" isFmt=\"\" isFile=\"\"/>\n" +
            "\t\t\t\t\t\t\t<ITEM key=\"jdccllxdm\" chn=\"机动车车辆类型代码\" rmk=\"\" isFmt=\"\" isFile=\"\"/>\n" +
            "\t\t\t\t\t\t\t<ITEM key=\"pczpdxbs\" chn=\"盘查照片对象标识\" rmk=\"\" isFmt=\"\" isFile=\"\"/>\n" +
            "\t\t\t\t\t\t\t<ITEM key=\"pcspdxbs\" chn=\"盘查视频对象标识\" rmk=\"\" isFmt=\"\" isFile=\"\"/>\n" +
            "\t\t\t\t\t\t\t<ITEM key=\"jdccsysdm\" chn=\"机动车车身颜色代码\" rmk=\"\" isFmt=\"\" isFile=\"\"/>\n" +
            "\t\t\t\t\t\t\t<ITEM key=\"cswpzk\" chn=\"车上物品状况\" rmk=\"\" isFmt=\"\" isFile=\"\"/>\n" +
            "\t\t\t\t\t\t\t<ITEM key=\"pcyy\" chn=\"盘查原因\" rmk=\"\" isFmt=\"\" isFile=\"\"/>\n" +
            "\t\t\t\t\t\t\t<ITEM key=\"pccljgdm\" chn=\"盘查处理结果代码\" rmk=\"\" isFmt=\"\" isFile=\"\"/>\n" +
            "\t\t\t\t\t\t\t<ITEM key=\"cjsj\" chn=\"采集时间\" rmk=\"\" isFmt=\"\" isFile=\"\"/>\n" +
            "\t\t\t\t\t\t\t<ITEM key=\"cjmj_jybh\" chn=\"采集民警警员编号\" rmk=\"\" isFmt=\"\" isFile=\"\"/>\n" +
            "\t\t\t\t\t\t\t<ITEM key=\"cjmj_gajgbmlbdm\" chn=\"采集民警公安机关部门类别代码\" rmk=\"\" isFmt=\"\" isFile=\"\"/>\n" +
            "\t\t\t\t\t\t\t<ITEM key=\"cjmj_gmsfhm\" chn=\"采集民警公民身份号码\" rmk=\"\" isFmt=\"\" isFile=\"\"/>\n" +
            "\t\t\t\t\t\t\t<ITEM key=\"xfsjlydm\" chn=\"巡防数据来源代码\" rmk=\"\" isFmt=\"\" isFile=\"\"/>\n" +
            "\t\t\t\t\t\t\t<ITEM key=\"sjtbsj\" chn=\"数据同步时间\" rmk=\"\" isFmt=\"\" isFile=\"\"/>\n" +
            "\t\t\t\t\t\t\t<ITEM key=\"sjgxsm\" chn=\"数据更新说明\" rmk=\"\" isFmt=\"\" isFile=\"\"/>\n" +
            "\t\t\t\t\t\t\t<ITEM key=\"sjgsdwdm\" chn=\"数据归属单位代码\" rmk=\"\" isFmt=\"\" isFile=\"\"/>\n" +
            "\t\t\t\t\t\t\t<ITEM key=\"sjgsdwmc\" chn=\"数据归属单位名称\" rmk=\"\" isFmt=\"\" isFile=\"\"/>\n" +
            "\t\t\t\t\t\t</DATA>\n" +
            "\t\t\t\t\t</DATASET>\n" +
            "\t\t\t\t</DATA>\n" +
            "\t\t\t</DATASET>\n" +
            "\t\t</DATA>\n" +
            "\t</DATASET>\n" +
            "</MESSAGE>\n" +
            "\n" +
            "\n" +
            "\n";


    //盘查人员信息
    public static String pancha_info = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "\n" +
            "<MESSAGE> \n" +
            "  <DATASET name=\"ZA_DATA_INDEX\" rmk=\"数据文件索引信息\"> \n" +
            "    <DATA> \n" +
            "      <DATASET name=\"ZA_DATA_FORMAT\" rmk=\"数据文件格式信息\"> \n" +
            "        <DATA> \n" +
            "          <ITEM key=\"lfgf\" val=\"\\t\" rmk=\"列分隔符\"/>  \n" +
            "          <ITEM key=\"hfgf\" val=\"\\n\" rmk=\"行分隔符\"/>  \n" +
            "          <ITEM key=\"xxzybsf\" val=\"130400-117070201-1-1\" rmk=\"信息资源标识符\"/>  \n" +
            "          <ITEM key=\"sjqsh\" val=\"1\" rmk=\"数据起始行\"/>  \n" +
            "          <ITEM key=\"wjbmgs\" val=\"UTF-8\" rmk=\"文件编码格式\"/>  \n" +
            "          <DATASET name=\"ZA_DATA_FILE\" rmk=\"数据文件信息\"> \n" +
            "            <DATA> \n" +
            "              <ITEM key=\"wjlj\" val=\"\" rmk=\"文件路径\"/>  \n" +
            "              <ITEM key=\"wjm\" val=\"bcp_filename.bcp\" rmk=\"文件名\"/>  \n" +
            "              <ITEM key=\"jlhs\" val=\"line_count\" rmk=\"记录行数\"/> \n" +
            "            </DATA> \n" +
            "          </DATASET>  \n" +
            "          <DATASET name=\"ZA_DATA_STRUCT\" rmk=\"文件数据结构\"> \n" +
            "            <DATA> \n" +
            "              <ITEM key=\"pcrybs\" chn=\"盘查人员对象标识\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "              <ITEM key=\"pcjldxbs\" chn=\"盘查记录对象标识\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "              <ITEM key=\"pczpdxbs\" chn=\"盘查照片对象标识\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "              <ITEM key=\"pcspdxbs\" chn=\"盘查视频对象标识\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "              <ITEM key=\"gmsfhm\" chn=\"公民身份号码\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "              <ITEM key=\"xbdm\" chn=\"性别代码\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "              <ITEM key=\"csrq\" chn=\"出生日期\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "              <ITEM key=\"dwmc\" chn=\"单位名称\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "              <ITEM key=\"dzmc\" chn=\"居住地址（住址）\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "              <ITEM key=\"lxdh\" chn=\"联系电话\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "              <ITEM key=\"lcqxmc\" chn=\"来处区县名称\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "              <ITEM key=\"qcqxmc\" chn=\"去处区县名称\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "              <ITEM key=\"sy\" chn=\"事由\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "              <ITEM key=\"cyzjdm\" chn=\"常用证件代码\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "              <ITEM key=\"jtgjlxdm\" chn=\"交通工具类型代码\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "              <ITEM key=\"zdgzrylxdm\" chn=\"重点关注人员类型代码\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "              <ITEM key=\"tstmtz\" chn=\"特殊体貌特征\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "\t\t\t  <ITEM key=\"pcyy\" chn=\"盘查原因\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "              <ITEM key=\"ryclqk\" chn=\"人员处理情况\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "              <ITEM key=\"pccljgdm\" chn=\"盘查处理结果代码\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "              <ITEM key=\"cjsj\" chn=\"采集时间\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "              <ITEM key=\"cjmj_jybh\" chn=\"采集民警警员编号\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "              <ITEM key=\"cjmj_gajgbmlbdm\" chn=\"采集民警公安机关部门类别代码\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "              <ITEM key=\"cjmj_gmsfhm\" chn=\"采集民警公民身份号码\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "              <ITEM key=\"xfsjlydm\" chn=\"巡防数据来源代码\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "              <ITEM key=\"sjtbsj\" chn=\"数据同步时间\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "              <ITEM key=\"pclxdm\" chn=\"盘查类型代码\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "              <ITEM key=\"sjgxsm\" chn=\"数据更新说明\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "              <ITEM key=\"sjgsdwdm\" chn=\"数据归属单位代码\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "              <ITEM key=\"sjgsdwmc\" chn=\"数据归属单位名称\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "            </DATA> \n" +
            "          </DATASET> \n" +
            "        </DATA> \n" +
            "      </DATASET> \n" +
            "    </DATA> \n" +
            "  </DATASET> \n" +
            "</MESSAGE>\n";


    //巡防排班信息
    public static String xunfang_info = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "\n" +
            "<MESSAGE> \n" +
            "  <DATASET name=\"ZA_DATA_INDEX\" rmk=\"数据文件索引信息\"> \n" +
            "    <DATA> \n" +
            "      <DATASET name=\"ZA_DATA_FORMAT\" rmk=\"数据文件格式信息\"> \n" +
            "        <DATA> \n" +
            "          <ITEM key=\"lfgf\" val=\"\\t\" rmk=\"列分隔符\"/>  \n" +
            "          <ITEM key=\"hfgf\" val=\"\\n\" rmk=\"行分隔符\"/>  \n" +
            "          <ITEM key=\"xxzybsf\" val=\"130400-117070106-1-1\" rmk=\"信息资源标识符\"/>  \n" +
            "          <ITEM key=\"sjqsh\" val=\"1\" rmk=\"数据起始行\"/>  \n" +
            "          <ITEM key=\"wjbmgs\" val=\"UTF-8\" rmk=\"文件编码格式\"/>  \n" +
            "          <DATASET name=\"ZA_DATA_FILE\" rmk=\"数据文件信息\"> \n" +
            "            <DATA> \n" +
            "              <ITEM key=\"wjlj\" val=\"\" rmk=\"文件路径\"/>  \n" +
            "              <ITEM key=\"wjm\" val=\"bcp_filename.bcp\" rmk=\"文件名\"/>  \n" +
            "              <ITEM key=\"jlhs\" val=\"line_count\" rmk=\"记录行数\"/> \n" +
            "            </DATA> \n" +
            "          </DATASET>  \n" +
            "          <DATASET name=\"ZA_DATA_STRUCT\" rmk=\"文件数据结构\"> \n" +
            "            <DATA> \n" +
            "              <ITEM key=\"XQPBDXBS\" chn=\"巡区排班对象标识\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "              <ITEM key=\"XQPBMC\" chn=\"巡区排班名称\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "              <ITEM key=\"XQMJ_JYBH\" chn=\"巡逻民警警员编号\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "              <ITEM key=\"XQMJ_XM\" chn=\"巡逻民警姓名\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "              <ITEM key=\"XQMJ_GAJGJGDM\" chn=\"巡逻民警公安机关机构代码\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "              <ITEM key=\"XQDXBS\" chn=\"巡区对象标识\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "              <ITEM key=\"XLQYMC\" chn=\"巡逻区域名称\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "              <ITEM key=\"XLRW_KSSJ\" chn=\"巡逻任务开始时间\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "              <ITEM key=\"XLRW_JSSJ\" chn=\"巡逻任务结束时间\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "              <ITEM key=\"SJGXSM\" chn=\"数据更新说明\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "\t\t\t  <ITEM key=\"SJGSDWDM\" chn=\"数据归属单位代码\" rmk=\"\" isFmt=\"\" isFile=\"\"/>\n" +
            "\t\t\t  <ITEM key=\"SJGSDWMC\" chn=\"数据归属单位名称\" rmk=\"\" isFmt=\"\" isFile=\"\"/>\n" +
            "            </DATA> \n" +
            "          </DATASET> \n" +
            "        </DATA> \n" +
            "      </DATASET> \n" +
            "    </DATA> \n" +
            "  </DATASET> \n" +
            "</MESSAGE>";


    //警情数据信息
    public static String jinqin_data_info = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "\n" +
            "<MESSAGE> \n" +
            "  <DATASET name=\"ZA_DATA_INDEX\" rmk=\"数据文件索引信息\"> \n" +
            "    <DATA> \n" +
            "      <DATASET name=\"ZA_DATA_FORMAT\" rmk=\"数据文件格式信息\"> \n" +
            "        <DATA> \n" +
            "          <ITEM key=\"lfgf\" val=\"\\t\" rmk=\"列分隔符\"/>  \n" +
            "          <ITEM key=\"hfgf\" val=\"\\n\" rmk=\"行分隔符\"/>  \n" +
            "          <ITEM key=\"xxzybsf\" val=\"130400-117060500-1-1\" rmk=\"信息资源标识符\"/>  \n" +
            "          <ITEM key=\"sjqsh\" val=\"1\" rmk=\"数据起始行\"/>  \n" +
            "          <ITEM key=\"wjbmgs\" val=\"UTF-8\" rmk=\"文件编码格式\"/>  \n" +
            "          <DATASET name=\"ZA_DATA_FILE\" rmk=\"数据文件信息\"> \n" +
            "            <DATA> \n" +
            "              <ITEM key=\"wjlj\" val=\"\" rmk=\"文件路径\"/>  \n" +
            "              <ITEM key=\"wjm\" val=\"bcp_filename.bcp\" rmk=\"文件名\"/>  \n" +
            "              <ITEM key=\"jlhs\" val=\"line_count\" rmk=\"记录行数\"/> \n" +
            "            </DATA> \n" +
            "          </DATASET>  \n" +
            "          <DATASET name=\"ZA_DATA_STRUCT\" rmk=\"文件数据结构\"> \n" +
            "            <DATA> \n" +
            "              <ITEM key=\"JQBS\" chn=\"警情标识\" rmk=\"\" isFmt=\"\" isFile=\"\"/>                                 \n" +
            "              <ITEM key=\"JQMC\" chn=\"警情名称\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "              <ITEM key=\"JQSJLY\" chn=\"警情数据来源\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "              <ITEM key=\"JQJB\" chn=\"警情级别\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "              <ITEM key=\"ASJFSKSSJ\" chn=\"案事件发生开始时间\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "              <ITEM key=\"ZAJQDM\" chn=\"治安警情代码\" rmk=\"\" isFmt=\"\" isFile=\"\"/>\n" +
            "              <ITEM key=\"SACSLBDM\" chn=\"涉案场所类别代码\" rmk=\"\" isFmt=\"\" isFile=\"\"/>\t\t\t  \n" +
            "              <ITEM key=\"SACS_DZMC\" chn=\"涉案场所地址名称\" rmk=\"\" isFmt=\"\" isFile=\"\"/>\n" +
            "\t\t\t  <ITEM key=\"SACS_DQJD\" chn=\"涉案场所地球经度\" rmk=\"\" isFmt=\"\" isFile=\"\"/> \n" +
            "\t\t\t  <ITEM key=\"SACS_DQWD\" chn=\"涉案场所地球纬度\" rmk=\"\" isFmt=\"\" isFile=\"\"/> \n" +
            "\t\t\t  <ITEM key=\"AY\" chn=\"案由\" rmk=\"\" isFmt=\"\" isFile=\"\"/> \n" +
            "\t\t\t  <ITEM key=\"BZ\" chn=\"备注\" rmk=\"\" isFmt=\"\" isFile=\"\"/> \n" +
            "\t\t\t  <ITEM key=\"GAJGJGDM\" chn=\"公安机关机构代码\" rmk=\"\" isFmt=\"\" isFile=\"\"/> \n" +
            "\t\t\t  <ITEM key=\"BJR_XM\" chn=\"报警人姓名\" rmk=\"\" isFmt=\"\" isFile=\"\"/> \n" +
            "\t\t\t  <ITEM key=\"BJR_LXDH\" chn=\"报警人联系电话\" rmk=\"\" isFmt=\"\" isFile=\"\"/> \n" +
            "\t\t\t  <ITEM key=\"BJSJ\" chn=\"报警时间\" rmk=\"\" isFmt=\"\" isFile=\"\"/> \n" +
            "\t\t\t  <ITEM key=\"CLR_XM\" chn=\"处理人姓名\" rmk=\"\" isFmt=\"\" isFile=\"\"/> \n" +
            "\t\t\t  <ITEM key=\"CLR_JJSJ01\" chn=\"处理人接警时间\" rmk=\"\" isFmt=\"\" isFile=\"\"/> \n" +
            "\t\t\t  <ITEM key=\"CLR_DDSJ\" chn=\"处理人到达时间\" rmk=\"\" isFmt=\"\" isFile=\"\"/> \n" +
            "\t\t\t  <ITEM key=\"CHL_CLSJ\" chn=\"处理时间\" rmk=\"\" isFmt=\"\" isFile=\"\"/> \n" +
            "\t\t\t  <ITEM key=\"CHL_JGCLJGDM\" chn=\"警情处理结果代码\" rmk=\"\" isFmt=\"\" isFile=\"\"/> \n" +
            "\t\t\t  <ITEM key=\"CHL_BZ\" chn=\"备注\" rmk=\"\" isFmt=\"\" isFile=\"\"/> \n" +
            "\t\t\t  <ITEM key=\"CHL_CHLTP\" chn=\"处理图片\" rmk=\"\" isFmt=\"\" isFile=\"\"/> \n" +
            "\t\t\t  <ITEM key=\"SJLY_XZQHDM\" chn=\"数据来源_行政区划代码\" rmk=\"\" isFmt=\"\" isFile=\"\"/> \n" +
            "\t\t\t  <ITEM key=\"XYRBSLB\" chn=\"嫌疑人标识列表\" rmk=\"\" isFmt=\"\" isFile=\"\"/> \n" +
            "\t\t\t  <ITEM key=\"JQSPBSLB\" chn=\"警情视频标识列表\" rmk=\"\" isFmt=\"\" isFile=\"\"/> \n" +
            "\t\t\t  <ITEM key=\"JQSPXX_SPSBBM\" chn=\"视频设备编码\" rmk=\"\" isFmt=\"\" isFile=\"\"/> \n" +
            "\t\t\t  <ITEM key=\"JQSPXX_SPWJGSDM\" chn=\"视频文件格式代码\" rmk=\"\" isFmt=\"\" isFile=\"\"/> \n" +
            "\t\t\t  <ITEM key=\"JQSPXX_KSSJ\" chn=\"开始时间\" rmk=\"\" isFmt=\"\" isFile=\"\"/> \n" +
            "\t\t\t  <ITEM key=\"JQSPXX_JSSJ\" chn=\"结束时间\" rmk=\"\" isFmt=\"\" isFile=\"\"/> \n" +
            "\t\t\t  <ITEM key=\"JQYPXX_YPSBBM\" chn=\"音频设备编码\" rmk=\"\" isFmt=\"\" isFile=\"\"/> \n" +
            "\t\t\t  <ITEM key=\"JQYPXX_YPWJGSDM\" chn=\"音频编码格式代码\" rmk=\"\" isFmt=\"\" isFile=\"\"/> \n" +
            "\t\t\t  <ITEM key=\"JQYPXX_KSSJ\" chn=\"开始时间\" rmk=\"\" isFmt=\"\" isFile=\"\"/> \n" +
            "\t\t\t  <ITEM key=\"JQYPXX_JSSJ\" chn=\"结束时间\" rmk=\"\" isFmt=\"\" isFile=\"\"/> \n" +
            "\t\t\t  <ITEM key=\"SJGXSM\" chn=\"数据更新说明\" rmk=\"\" isFmt=\"\" isFile=\"\"/> \n" +
            "\t\t\t  <ITEM key=\"SJGSDWDM\" chn=\"数据归属单位代码\" rmk=\"\" isFmt=\"\" isFile=\"\"/> \n" +
            "\t\t\t  <ITEM key=\"SHGSDWMC\" chn=\"数据归属单位名称\" rmk=\"\" isFmt=\"\" isFile=\"\"/> \n" +
            "            </DATA> \n" +
            "          </DATASET> \n" +
            "        </DATA> \n" +
            "      </DATASET> \n" +
            "    </DATA> \n" +
            "  </DATASET> \n" +
            "</MESSAGE>";


    //巡逻人员信息
    public static String xunluo = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "\n" +
            "<MESSAGE> \n" +
            "  <DATASET name=\"ZA_DATA_INDEX\" rmk=\"数据文件索引信息\"> \n" +
            "    <DATA> \n" +
            "      <DATASET name=\"ZA_DATA_FORMAT\" rmk=\"数据文件格式信息\"> \n" +
            "        <DATA> \n" +
            "          <ITEM key=\"lfgf\" val=\"\\t\" rmk=\"列分隔符\"/>  \n" +
            "          <ITEM key=\"hfgf\" val=\"\\n\" rmk=\"行分隔符\"/>  \n" +
            "          <ITEM key=\"xxzybsf\" val=\"130400-117070103-1-1\" rmk=\"信息资源标识符\"/>  \n" +
            "          <ITEM key=\"sjqsh\" val=\"1\" rmk=\"数据起始行\"/>  \n" +
            "          <ITEM key=\"wjbmgs\" val=\"UTF-8\" rmk=\"文件编码格式\"/>  \n" +
            "          <DATASET name=\"ZA_DATA_FILE\" rmk=\"数据文件信息\"> \n" +
            "            <DATA> \n" +
            "              <ITEM key=\"wjlj\" val=\"\" rmk=\"文件路径\"/>  \n" +
            "              <ITEM key=\"wjm\" val=\"bcp_filename.bcp\" rmk=\"文件名\"/>  \n" +
            "              <ITEM key=\"jlhs\" val=\"line_count\" rmk=\"记录行数\"/> \n" +
            "            </DATA> \n" +
            "          </DATASET>  \n" +
            "          <DATASET name=\"ZA_DATA_STRUCT\" rmk=\"文件数据结构\"> \n" +
            "            <DATA> \n" +
            "              <ITEM key=\"XLRYDXBS\" chn=\"巡逻人员对象标识\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "              <ITEM key=\"XM\" chn=\"姓名\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "              <ITEM key=\"XZQHDM\" chn=\"行政区划代码\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "              <ITEM key=\"XLRYLBDM\" chn=\"巡逻人员类别代码\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "              <ITEM key=\"XLMJ_JYBH\" chn=\"巡逻民警警员编号\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "              <ITEM key=\"XLMJ_LXDH\" chn=\"巡逻民警联系电话\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "              <ITEM key=\"XLMJ_JWYWZJBDM\" chn=\"巡逻民警警衔与文职级别代码\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "              <ITEM key=\"XLMJ_GAJGJGDM\" chn=\"巡逻民警公安机关机构代码\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "              <ITEM key=\"XLMJ_GAJGMC\" chn=\"巡逻民警公安机关名称\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "              <ITEM key=\"XLMJ_GAJGBMLBDM\" chn=\"巡逻民警公安机关部门类别代码\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "              <ITEM key=\"GMSFHM\" chn=\"公民身份号码\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "              <ITEM key=\"NL\" chn=\"年龄\" rmk=\"\" isFmt=\"\" isFile=\"\"/>   \n" +
            "              <ITEM key=\"MZDM\" chn=\"民族代码\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "              <ITEM key=\"JGSSXDM\" chn=\"籍贯省市县代码\" rmk=\"\" isFmt=\"\" isFile=\"\"/>  \n" +
            "\t\t\t  <ITEM key=\"XBDM\" chn=\"性别代码\" rmk=\"\" isFmt=\"\" isFile=\"\"/>\n" +
            "\t\t\t  <ITEM key=\"DZMC\" chn=\"地址名称\" rmk=\"\" isFmt=\"\" isFile=\"\"/>\n" +
            "\t\t\t  <ITEM key=\"XLDM\" chn=\"学历代码\" rmk=\"\" isFmt=\"\" isFile=\"\"/>\n" +
            "\t\t\t  <ITEM key=\"HYZKDM\" chn=\"婚姻状况代码\" rmk=\"\" isFmt=\"\" isFile=\"\"/>\n" +
            "\t\t\t  <ITEM key=\"ZZMMDM\" chn=\"政治面貌代码\" rmk=\"\" isFmt=\"\" isFile=\"\"/>\n" +
            "\t\t\t  <ITEM key=\"SJGXSM\" chn=\"数据更新说明\" rmk=\"\" isFmt=\"\" isFile=\"\"/>\n" +
            "\t\t\t  <ITEM key=\"SJGSDWDM\" chn=\"数据归属单位代码\" rmk=\"\" isFmt=\"\" isFile=\"\"/>\n" +
            "\t\t\t  <ITEM key=\"SJGSDWMC\" chn=\"数据归属单位名称\" rmk=\"\" isFmt=\"\" isFile=\"\"/>\n" +
            "            </DATA> \n" +
            "          </DATASET> \n" +
            "        </DATA> \n" +
            "      </DATASET> \n" +
            "    </DATA> \n" +
            "  </DATASET> \n" +
            "</MESSAGE>";



}
