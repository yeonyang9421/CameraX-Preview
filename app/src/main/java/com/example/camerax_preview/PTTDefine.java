package com.example.camerax_preview;


public class PTTDefine {

    public static final String KEY_CHANNEL_POS = "select_pos";
    public static final int KEY_CHANNEL_POS_MY          = 0;
    public static final int    KEY_CHANNEL_POS_PUBLIC          = 1;
    public static final int    KEY_CHANNEL_POS_PRIVATE             = 2;
    public static final int    ORGANIZATION_TYPE_MEMBER            = 1;
    public static final int    CONTACT_TOPNODE_TITLE_COUNT        = 4;


    /*** REQUEST CODE ***********************************************/
    public static final int REQUEST_CODE_INVITE_MEMBER  = 11001;
    public static final int REQUEST_CODE_CHANNEL_INFO   = 11002;
    public static final int REQUEST_CODE_PASSWD_INPUT   = 11003;
    public static final int REQUEST_CODE_WRITE_SETTINGS = 11004;
    public static final int REQUEST_CODE_DEVICE_INPUT   = 11005;
    public static final int REQUEST_CODE_MAKE_VOICE_CALL= 11006;
    public static final int REQUEST_CODE_MAKE_VIDEO_CALL= 11007;
    public static final int REQUEST_CODE_CHANNEL_CHANGE = 11008;
    public static final int REQUEST_CODE_CONTACT_MEMBER = 11009;
    public static final int REQUEST_CODE_CONTACT_MEMBER_FAVORITE = 11010;
    public static final int REQUEST_CODE_PASSWD_CHANGE  = 11011;        //2020-02-21 HAN ADD
    public static final int REQUEST_CODE_MAKE_CALL      = 11012;        //컨퍼런스 참여자 선택 화면용


    /*** RESULT CODE ***********************************************/
    public static final int RESULT_CODE_CHANNEL_CLOSED          = 12001;
    public static final int RESULT_CODE_CHANNEL_RELEASED        = 12002;
    public static final int RESULT_CODE_CHANNEL_CHANGED         = 12003;
    public static final int RESULT_CODE_CHANNEL_FAVORITE_CHANGE = 12004;

    /*** Server Error Response Code ***********************************************/
    public static final int ERR_NUMBER_FORMAT  	     = 1001;	//전화번호 포맷 오류
    public static final int ERR_IUID                 = 1002;	//잘 못된 IUID 예) 0 또는 -1
    public static final int ERR_UNKNWON_REQ_TYPE     = 1003;	//지원하지 않는 req-type
    public static final int ERR_NO_DEVICEINFO        = 1004;	//디바이스 정보가 없음
    public static final int ERR_NO_PROFILE           = 1005;	//프로필 정보가 없음
    public static final int ERR_NO_OS_INFO           = 1006;	//OS 정보가 없음
    public static final int ERR_NO_OS_VERSION        = 1007;	//OS 버전 정보가 없음
    public static final int ERR_NICKNAME_FORBIDDEN   = 1008;	//닉네임에 금지어 포함 됨
    public static final int ERR_STATUS_FORBIDDEN     = 1009;	//상태메시지에 금지어 포함 됨
    public static final int ERR_NICKNAME_OVERLAP     = 1010;	//이미 존재하는 닉네임
    public static final int ERR_NO_ADDRESS_INFO      = 1011;	//OEM 주소록 리스트 정보가 없음
    public static final int ERR_NO_PROFILE_INFO      = 1012;	//프로필 리스트 정보가 없음
    public static final int ERR_UNKNWON_SYNC_MODE    = 1013;	//지원하지 않는 동기화 모드
    public static final int ERR_UNKNWON_PROFILE_TYPE = 1014;	//지원하지 않는 프로필 항목

    public static final int ERR_NO_DEVICE_ID         = 1015;	//디바이스 ID가 없음
    public static final int ERR_NO_THUMBNAIL         = 1016;	//프로필 이미지 파일은 있으나 썸네일 파일이 없음
    public static final int ERR_UNKNOWN_DEFAULT_IMG  = 1017;	//기본 이미지 번호가 잘 못 됨. (0 이하)
    public static final int ERR_UNKNWON_DEFAULT_COLOR= 1018;	//기본 이미지 색상 번호가 잘 못 됨. (0 이하)
    public static final int ERR_IUID_IS_NOT_SBCRIBER = 1019;	//해당 iuid의 사용자가 가입자가 아님.

    public static final int ERR_CALLSIGN_EDIT_CNT_EXCEEDED 	= 1030;	//닉네임 변경 횟수 초과.
    public static final int ERR_RECOMMEND_CNT_EXCEEDED 	= 1031;	//추천 변경 횟수 초과.
    public static final int ERR_CALLSIGN_NOT_EXISTED 	= 1032;	//닉네임 존재하지 않음.
    public static final int ERR_MDN_NOT_EXISTED			= 1033;	//전화번호 존재하지 않음.

    // RMS
    public static final String ERR_BANNED_MEMBER		= "BANNED_MEMBER";		// 참여자 내보내기
    public static final String ERR_FORBIDDEN_MEMBER		= "FORBIDDEN_MEMBER";	// 참여자 추방

    // SCF
    public static final int ERR_SCF_RESULT_0		= 0;	// 성공
    public static final int ERR_SCF_RESULT_100		= 100;	// 일부 성공 ( 다수의 사용자 대상 요청시 )
    public static final int ERR_SCF_RESULT_500		= 500;	// 전체 실패 ( 다수의 사용자 대상 요청시 )
    public static final int ERR_SCF_RESULT_1		= 1;	// 대화방 정보 없음
    public static final int ERR_SCF_RESULT_2		= 2;	// 대화방 활성화 상태 아님
    public static final int ERR_SCF_RESULT_3		= 3;	// 대화방 멤버가 아님
    public static final int ERR_SCF_RESULT_4		= 4;	// 강퇴 사용자
    public static final int ERR_SCF_RESULT_5		= 5;	// 부정확한 대상자 ( 대상자가 될 수 없는 사용자. 예를 들어 방장 )
    public static final int ERR_SCF_RESULT_6		= 6;	// 중복 사용자
    public static final int ERR_SCF_RESULT_7		= 7;	// 비가입자
    public static final int ERR_SCF_RESULT_8		= 8;	// 필수 정보가 없거나 올바르지 않음
    public static final int ERR_SCF_RESULT_9		= 9;	// 권환 없음
    public static final int ERR_SCF_RESULT_10		= 10;	// 정화번호 오류
    public static final int ERR_SCF_RESULT_11		= 11;	// 이미 입장한 사용자
    public static final int ERR_SCF_RESULT_12		= 12;	// 이미 다른 사람이 발언권을 가지고 있음
    public static final int ERR_SCF_RESULT_13		= 13;	// 발언권 해지 실패
    public static final int ERR_SCF_RESULT_14		= 14;	// 발언권 중지된 사용자
    public static final int ERR_SCF_RESULT_15		= 15;	// 이미 발언권을 가지고 잇음
    public static final int ERR_SCF_RESULT_16		= 16;	// 발언권을 가지고 있지 않음
    public static final int ERR_SCF_RESULT_18		= 18;	// 전화 연결이 되어 있지 않음
    public static final int ERR_SCF_RESULT_19		= 19;	// 초대자 수가 방에 허용된 멤버수를 넣음
    public static final int ERR_SCF_RESULT_20		= 20;	// 접속 타입을 확인할 수 없음
    public static final int ERR_SCF_RESULT_21		= 21;	// 메시지 파싱 에러
    public static final int ERR_SCF_RESULT_22		= 22;	// 지원하지 않음
    public static final int ERR_SCF_RESULT_23		= 23;	// 음성 연결 정보가 없음 (MCU)
    public static final int ERR_SCF_RESULT_99		= 99;	// 시스템 에러
    public static final int ERR_SCF_RESULT_50		= 50;	// 사용자에게 보여져야 할 에러코드 기준(v1.0.5이후)

    /*** SMS Country Code Option  ***************************************************/
    public static final String REQUEST_RESULT_COUNTRY_CODE 	= "result_coiuntry_code";

    /*** Profile Option  ***************************************************/
    public static final int	    REQUEST_CODE_THUMB			= 4001;
    public static final String REQUEST_RESULT_THUMB_MAIN 	= "result_thumb_main";
    public static final String REQUEST_RESULT_THUMB_BACK 	= "result_thumb_back";

    public static final String CONTACTS_IUID               = "contacts_iuid";

    public static final int MODE_REAL_COMMERCIAL	= 0;

    private static final int MODE_QA_TB				= 1;
    private static final int MODE_QA_COMMERCIAL		= 2;
    private static final int MODE_DEV_TB			= 3;
    private static final int MODE_DEV_COMMERCIAL	= 4;
    private static final int MODE_SKT_DEV_TB		= 5;

    public static final int PROTOCOL_VER1			= 1;
    public static final int PROTOCOL_VER2			= 2;
    public static final int VERSION					= PROTOCOL_VER2; // MBCP Protocol

    /** Release Version */
    public static final int RELEASE_MODE			= MODE_REAL_COMMERCIAL;

    public static final boolean FUNCTION_ENGINEERMODE = RELEASE_MODE != MODE_REAL_COMMERCIAL; // Engineer Mode

    public static final boolean USE_ANALYTICS		= true;

    public static final boolean USE_SCREEN_STATE	= true; //무전중이 아닌경우  Screen off시 15초 이후 session close처리 screen on시 다시 session start

    public static final boolean MODE_COMMERCIAL
            = (RELEASE_MODE == MODE_REAL_COMMERCIAL) || (RELEASE_MODE == MODE_QA_COMMERCIAL) || (RELEASE_MODE == MODE_DEV_COMMERCIAL); // 상용서버 접속 시 true

    public static final boolean MODE_SKT_TB			= (RELEASE_MODE == MODE_SKT_DEV_TB); // SKT TB 버전, TB용 mvp 설정할 것
    public static final boolean MODE_TI2_TB			= (RELEASE_MODE == MODE_QA_TB) || (RELEASE_MODE == MODE_DEV_TB);

    public static final boolean DISABLE_SSL_CHECK_FOR_TESTING	= MODE_TI2_TB; //rootCA에 의한 인증서가 아닌 경우

    public static final boolean DEBUG_TOAST
            = (RELEASE_MODE == MODE_DEV_TB) || (RELEASE_MODE == MODE_DEV_COMMERCIAL);
    public static final boolean DEBUG_PUSH
            = (RELEASE_MODE == MODE_DEV_TB) || (RELEASE_MODE == MODE_DEV_COMMERCIAL); // 모든 GCM/AOM 을 notification 띄우도록 기능 추가


    public static final boolean TEST_SCS
            = (RELEASE_MODE == MODE_SKT_DEV_TB) || (RELEASE_MODE == MODE_DEV_TB) || (RELEASE_MODE == MODE_QA_TB); // SCS 인증 SKIP

    /** 해외 로밍 시 2016.11.17  현재 서비스 하지 않음 */
    public static final boolean FUNCTION_ON_ROAMING			= false;

    /** EngineerMode 의 device 지원 여부.
     * 해당 기능 true 일때, 설정에서 버전 정보 여러번 클릭 시 engineer 모드 활성화 됨.
     * 상용 서비스에는 false 로 릴리
     * - 로밍 기능 on/off
     * - 해외 usim on/off
     * - 신규 BT device 추가/삭제 시
     *
     */
    public static final boolean FUNCTION_ENGMODE_DEVICE		= false;

    /** 시험 중인 기능. 시험 완료 후 define 삭제 필요. */
    public static final boolean FUNCTION_TUNING				= true;

    public static final boolean FUNCTION_TEST				= false;

    /** Audio 및 MBCP Port Random */
    public static final boolean FUNCTION_PORT_RANDOM		= true;

    /** v1.0.2 기능 13) Line1 Number 읽기 실패 했을 경우 Skip 하도록 수정 */
    public static final boolean FUNCTION_NO_NUMBER 	= true;

    /** 가입/로그인 SMS 직접 입력 허용 */
    public static final boolean FUNCTION_SMS_DIRECTINPUT	= true;

    public static final String KEY_UPDATE_POPUP_CHECK 	 = "preference_update_popup_check"; // 업데이트 팝업 7일간 보지 않기 체크한 시간

    /** Profile ThumbNails Info	*****************************************************/
    public static final int		THUMB_TYPE_MAIN_M1		= 1;
    public static final int		THUMB_TYPE_MAIN_M2		= 2;
    public static final int		THUMB_TYPE_MAIN_M3		= 3;
    public static final int		THUMB_TYPE_MAIN_W1		= 4;
    public static final int		THUMB_TYPE_MAIN_W2		= 5;
    public static final int		THUMB_TYPE_MAIN_W3		= 6;
    public static final int		THUMB_TYPE_MAIN_CMD		= 100;

    public static final int		THUMB_TYPE_BACK_GRAY 	= 0;
    public static final int		THUMB_TYPE_BACK_YELLOW	= 1;
    public static final int		THUMB_TYPE_BACK_GREEN	= 2;
    public static final int		THUMB_TYPE_BACK_BLUE	= 3;
    public static final int		THUMB_TYPE_BACK_MAGENTA	= 4;
    public static final int		THUMB_TYPE_BACK_PINK	= 5;
    public static final int 	THUMB_TYPE_BACK_DEFAULT	= THUMB_TYPE_BACK_YELLOW;
    public static final int 	THUMB_TYPE_BACK_DIM		= THUMB_TYPE_BACK_GRAY;


    ////////////////////////////////////////////////////////////////////////////////////
    //  서비스 기능  On/Off
    ////////////////////////////////////////////////////////////////////////////////////
    public static final boolean FUNCTION_AOM		= true; 	// aom 적용 여부 //CK_TEST true 로 서비
    public static final boolean FUNCTION_AOT 		= true; 	// aoT 적용 여부
    public static final boolean FUNCTION_JOIN_SMS_WAIT = false; // 가입 시 SMS 인증 요청 이후 sms 수신 시 까지 대기. 2015.10.29 현재는 대기하지 않음. SKT 요청.
    public static final boolean FUNCTION_SEARCH_SVR	= true; 	// true:검색 서버 기능 false: 검색을 Client local 에서 수행. 2015.12.14 1.1 Digit 5 자리 기능.
    public static final boolean DEBUG_SHOW_RSP		= true;
    public static final boolean DEBUG_PERFORMANCE	= false;
    public static final boolean FUNCTION_ENTER		= false;

    // Install Type
    public static final int		JOIN_TYPE_NONE				= 0;
    public static final int		JOIN_TYPE_INSTALL			= 1;
    public static final int		JOIN_TYPE_REINSTALL			= 2;
    public static final int		JOIN_TYPE_WITHDRAW_INSTALL	= 3;
    public static final int		JOIN_TYPE_CHECK_CW			= 4;

    // Entry Type
    public static final int 	ENTRY_TYPE_NEW				= 1000; // 새채널 생성
    public static final int 	ENTRY_TYPE_INVITE			= 2000; // 오키토키 채널 초대
    public static final int 	ENTRY_TYPE_NOTIFY			= 3000; // 상태바 진입
    public static final int 	ENTRY_TYPE_URL_LINK			= 4000; // 초대 URL 진입
    public static final int 	ENTRY_TYPE_PROMOTION		= 5000; // 상태바 > 프로모션 알림
    public static final int 	ENTRY_TYPE_UPDATE			= 5001; // 상태바 > 업데이트 알림
    public static final int 	ENTRY_TYPE_POPUP_SET		= 6000; // 부재중 알림 팝업 > 설정
    public static final int 	ENTRY_TYPE_POPUP_JOIN		= 6001; // 부재중 알림 팝업 > 입장
    public static final int 	ENTRY_TYPE_JOIN				= 7000; // 상태바 > 부방장임명/해제 알림

    //JoinTerms
    public static final String REQUEST_JOIN_TERMS			= "request_join_terms";

    public static final String KEY_PROMO_LAST_MSGID		 = "preference_msg_id"; 		// msg_id
    public static final String KEY_PROMO_LAST_URL		 = "preference_promo_url"; 		// promotion date
    public static final String KEY_PROMO_LINK_CLICKED	 = "preference_promo_clicked"; 	// promotion click 여부
    public static final String KEY_PROMO_POPUP_SHOWED	 = "preference_promo_showed";	// promotion popup showed 여부
    public static final String KEY_PROMO_POPUP_SHOWED_ID = "preference_promo_showed_id"; // promotion last msg id
    public static final String KEY_MY_CH_ABSENCE_NOTI	  = "preference_my_ch_absence_noti"; // 내가 만든 채널 알림 설정
    public static final String KEY_MEMBER_CH_ABSENCE_NOTI = "preference_member_ch_absence_noti"; // 참여중인 채널 알림 설정
    public static final String KEY_TERMS_MARKETING		  = "preference_terms_marketing"; // 마케팅 활용 동의 여부

    // setting
    public static final String KEY_MESSAGE			= "preference_message";
    public static final String KEY_NICKNAME			= "preference_nickname";
    public static final String KEY_THUMB_MAIN		= "preference_thumb_main";
    public static final String KEY_THUMB_BACK		= "preference_thumb_back";
    public static final String KEY_PRESENSE			= "preference_presence";

    public static final String TYPE_SKT		    	= "45005";
    public static final String TYPE_KT                 = "45008";

    public static final String TYPE_OWN_OPERATOR		= TYPE_SKT;
    public static final String TYPE_OWN_COUNTRY_ISO	= "KR";

    public static final String KEY_ENG_ROAMING		= "key_eng_roaming";
    public static final String KEY_ENG_GLOBALUSIM	= "key_eng_globalusim";
    public static final String KEY_ENG_ENGMODE_DEVICE = "key_eng_engmode_device";

    //Contact
    public static final String REQUEST_CONTACT				= "request_contact";

    public static final String ACTION_CONTACT				= "action_contact";
    public static final String TAB_POSITION                = "tab_position";

    public static final int	    ACTION_MESSAGE				= 0; // 메시지 전송
    public static final int	    ACTION_MOVCALL				= 1; // 영상통화
    public static final int	    ACTION_VOCCALL				= 2; // 음성통화
    public static final int	    ACTION_MOVPTT				= 3; // 영상무전
    public static final int	    ACTION_VOCPTT				= 4; // 음성무전

    /** test use 해외 USIM granted */
    public static final boolean FUNCTION_GLOBAL_USIM_GRANTED= false; //CK_TEST false 로 서비스

    /*** NONE 정의 *********************************************/
    public static final int    I_NONE = -1;
    public static final String NONE   = "UNDEF";

    /*** ROIP 구분자 *******************************************/
    public static final long ROIP_MASK = 0x5000000000000000L;

    /*** 지령대 Prefix *******************************************/
    public static final String COMMANDER_E164_PREFIX = "+226";

    /*** 개별무전 Prefix *******************************************/
    public static final int O2O_DAYS_TO_KEEP  = 7;
    public static final int O2O_LIMIT_TO_KEEP = 100;

    /*** Activity Request Code 정의 ****************************/
    //IntroActivity
    public static final int REQ_APP_DETAILS_SETTINGS= 1000;
    public static final int REQ_APP_PERM_AGREE      = 1001;
    public static final int REQ_APP_APK_DOWNLOAD    = 1002;
    public static final int REQ_APP_BATTERY_OPTIMIZATIONS = 1003;
    public static final int REQ_APP_RESTRICT_BACKGROUND   = 1004;
    public static final int REQ_APP_EDIT_CHANNEL_NAME   = 1005;
    public static final int REQ_APP_OVERLAY_OPTIMIZATIONS   = 1006;
    public static final int REQ_APP_PROFILE_CHANGED   = 1007;

    /*** Hook 알림음 ***********************************/
    public final static int HOOK_ALRAM01	= 0;
    public final static int HOOK_ALRAM02 	= 1;
    public final static int HOOK_ALRAM03 	= 2;
    public final static int HOOK_ALRAM04 	= 3;
    public final static int HOOK_ALRAM05 	= 4;
    public final static int HOOK_ALRAM06 	= 5;

    /*** Audio Path ********************************************/
    public static class AudioPath {
        public static final int I_NONE      = 0;
        public static final int I_SPEAKER   = 1;
        public static final int I_BLUETOOTH = 2;
        public static final int I_EARPHONE  = 3;

        public static String valueOf(int code) {
            switch (code) {
                case I_NONE      : return "NONE";
                case I_SPEAKER   : return "SPEAKER";
                case I_BLUETOOTH : return "BLUETOOTH";
                case I_EARPHONE  : return "EARPHONE";
            }

            return "UNK(" + code + ")";
        }
    }

    /*** UI STATE ********************************************/
    public static class UI_STATE {
        public static final int I_CREATED  = 0;
        public static final int I_STARTED  = 1;
        public static final int I_RESUMED  = 2;
        public static final int I_PAUSED   = 3;
        public static final int I_STOPPED  = 4;
        public static final int I_DESTROYED = 5;

        public static String valueOf(int code) {
            switch (code) {
                case I_NONE     : return "NONE";
                case I_CREATED  : return "CREATED";
                case I_STARTED  : return "STARTED";
                case I_RESUMED  : return "RESUMED";
                case I_PAUSED   : return "PAUSED";
                case I_STOPPED  : return "STOPPED";
                case I_DESTROYED: return "DESTROIED";
            }

            return "UNK(" + code + ")";
        }
    }

    /*** MAIN UI TYPE ********************************************/
    public static class MAIN_UI_TYPE {
        public static final int I_RUNTIME = 1;
        public static final int I_ONE     = 2;

        public static String valueOf(int code) {
            switch (code) {
                case I_RUNTIME : return "RUNTIME";
                case I_ONE     : return "ONE";
            }

            return "UNK(" + code + ")";
        }
    }


    /*** Touch Reason 정의 *****************************/
    //RuntimeServer에게 Touch 전송시, reason 값으로 사용
    public static class TOUCH_REASON {
        public static final int I_JUST_CHECK = 9000;
        public static final int I_SCREEN_ON  = 9001;
        public static final int I_SCREEN_OFF = 9002;
        public static final int I_CONNECTIVITY_ON  = 9003;
        public static final int I_CONNECTIVITY_OFF = 9004;
        public static final int I_PACKAGE_REPLACED = 9005;
        public static final int I_CHANNEL_REFRESHED= 9006;
        public static final int I_PUSH_RECEIVED    = 9007;
        public static final int I_DEFAULT_NETWORK_CHANGED  = 9008;
        public static final int I_PTT_KEY_DOWN  = 9009;
        public static final int I_PTT_KEY_UP    = 9010;
        public static final int I_POWER_SHUTDOWN= 9011;
        public static final int I_UI_NOTI = 9012;
        public static final int I_SETTINGS_ONESHOT_CHANGED = 9013;
        public static final int I_SETTINGS_POSITION_SHARE_CHANGED = 9014;

        public static String valueOf(int code) {
            switch (code) {
                case I_JUST_CHECK: return "JUST_CHECK";
                case I_SCREEN_ON : return "SCREEN_ON";
                case I_SCREEN_OFF: return "SCREEN_OFF";
                case I_CONNECTIVITY_ON  : return "CONNECTIVITY_ON";
                case I_CONNECTIVITY_OFF : return "CONNECTIVITY_OFF";
                case I_PACKAGE_REPLACED : return "PACKAGE_REPLACED";
                case I_CHANNEL_REFRESHED: return "CHANNEL_REFRESHED";
                case I_PUSH_RECEIVED    : return "PUSH_RECEIVED";
                case I_DEFAULT_NETWORK_CHANGED: return "DEFAULT_NETWORK_CHANGED";
                case I_PTT_KEY_DOWN     : return "PTT_KEY_DOWN";
                case I_PTT_KEY_UP       : return "PTT_KEY_UP";
                case I_POWER_SHUTDOWN   : return "POWER_SHUTDOWN";
                case I_UI_NOTI          : return "UI_NOTI";
                case I_SETTINGS_ONESHOT_CHANGED: return "SETTINGS_ONESHOT_CHANGED";
                case I_SETTINGS_POSITION_SHARE_CHANGED: return "SETTINGS_POSITION_SHARE_CHANGED";
            }

            return "UNK(" + code + ")";
        }
    }

    /*** Touch Reason 정의 *****************************/
    public static final int MAX_PTT_VOLUME = 7; //ui level
    public static final int MIN_PTT_VOLUME = 2;
    public static final int MAX_PTT_VOLUME_LEVEL = 6;//volume control level

    /*** TelViewType 정의 *****************************/
    public static class TEL_VIEW_TYPE {
        public static final int I_AUDIO_RINGING  = 0;
        public static final int I_AUDIO_LAUNCHER = 1;
        public static final int I_VIDEO_RINGING  = 2;
        public static final int I_VIDEO_LAUNCHER = 3;

        public static String valueOf(int code) {
            switch (code) {
                case I_AUDIO_RINGING  : return "AUDIO_RINGING";
                case I_AUDIO_LAUNCHER : return "AUDIO_LAUNCHER";
                case I_VIDEO_RINGING  : return "VIDEO_RINGING";
                case I_VIDEO_LAUNCHER : return "VIDEO_LAUNCHER";
            }

            return "UNK(" + code + ")";
        }
    }

    /*** PTTViewType 정의 *****************************/
    public static class PTT_VIEW_TYPE {
        public static final int I_SPLASH = 0;
        public static final int I_MAIN   = 1;
        public static final int I_AUDIO  = 2;
        public static final int I_VIDEO  = 3;
        public static final int I_ROOM_AUDIO  = 4;
        public static final int I_ROOM_VIDEO  = 5;

        public static String valueOf(int code) {
            switch (code) {
                case I_SPLASH : return "SPLASH";
                case I_MAIN   : return "MAIN";
                case I_AUDIO  : return "AUDIO";
                case I_VIDEO  : return "VIDEO";
                case I_ROOM_AUDIO  : return "ROOM_AUDIO";
            }

            return "UNK(" + code + ")";
        }
    }

    /*** PTT_KEY_TYPE 정의 *****************************/
    public static class PTT_KEY_TYPE {
        public static final int I_NOACTION     = 0;
        public static final int I_HOOK_TALKREQ = 1;
        public static final int I_HOOK_TALKREL = 2;

        public static String valueOf(int code) {
            switch (code) {
                case I_NOACTION     : return "NOACTION";
                case I_HOOK_TALKREQ : return "TALK_REQ";
                case I_HOOK_TALKREL : return "TALK_REL";
            }

            return "UNK(" + code + ")";
        }
    }

    /*** OEM_SYNC_RESULT 정의 *****************************/
    public static class OEM_SYNC_RESULT {
        public static final int I_SUCC = 0;
        public static final int I_FAIL = 1;
        public static final int I_ALREADY_RUNNING = 2;
        public static final int I_ONLINE_FAIL     = 3;

        public static String valueOf(int code) {
            switch (code) {
                case I_SUCC : return "SUCC";
                case I_FAIL : return "FAIL";
                case I_ALREADY_RUNNING : return "ALREADY_RUNNING";
                case I_ONLINE_FAIL     : return "ONLINE_FAIL";
            }

            return "UNK(" + code + ")";
        }
    }

    public static class CALL_HISTORY_RESULT {
        public static final int I_SUCC = 0;
        public static final int I_FAIL = 1;
        public static final int I_DENY = 2;
        public static final int I_BUSY = 3;
        public static final int I_NO_ANSWER = 4;

        public static String valueOf(int code) {
            switch (code) {
                case I_SUCC: return "SUCC";
                case I_FAIL: return "FAIL";
                case I_DENY: return "DENY";
                case I_BUSY: return "BUSY";
                case I_NO_ANSWER: return "NOANSWER";
            }

            return "UNK(" + code + ")";
        }
    }

    public static class POPUP_TYPE {
        public static final int I_COMMON = 0;
        public static final int I_INVITE = 1;
        public static final int I_RINGING= 2;
        public static final int I_CMD_RES= 3;
        public static final int I_LOCATION_REQUEST= 4;
        public static final int I_GPS_SETTING_FOR_LR= 5; //for LOCATION_REQUEST
        public static final int I_ANSWER_ACCEPT   = 6;
        public static final int I_ANSWER_DENY     = 7;
        public static final int I_MEDIA_CHANGE_TO_AUDIO = 8;
        public static final int I_MEDIA_CHANGE_TO_VIDEO = 9;
        public static final int I_OPE_FIRMWARE_UPDATE   = 10;
        public static final int I_OPE_EVENT_NOTICE      = 11;
        public static final int I_OPE_EVENT_COMPANY_NOTICE = 12;
        public static final int I_OPE_EVENT_LICENSE_NOTICE = 13;
        public static final int I_CONTROL_LOGOUT_REQUEST   = 14;
        public static final int I_WARNING = 15;
        public static final int I_GPS_SETTING_FOR_BG= 16; //for 백그라운드 위치 관제(GPS off인 경우)
        public static final int I_APP_UPDATE = 17; //업데이트 팝업
        public static final int I_LOCATION_CONTROL_FOR_BG= 18; //for 백그라운드 위치 관제(앱내 설정이 off인 경우)
        public static String valueOf(int code) {
            switch (code) {
                case I_COMMON : return "COMMON";
                case I_INVITE : return "INVITE";
                case I_RINGING: return "RINGING";
                case I_CMD_RES: return "CMD_RES";
                case I_LOCATION_REQUEST: return "LOCATION_REQUEST";
                case I_GPS_SETTING_FOR_LR: return "GPS_SETTING_FOR_LR";
                case I_GPS_SETTING_FOR_BG: return "GPS_SETTING_FOR_BG";
                case I_ANSWER_ACCEPT   : return "ANSWER_ACCEPT";
                case I_ANSWER_DENY     : return "ANSWER_DENY";
                case I_MEDIA_CHANGE_TO_AUDIO: return "MEDIA_CHANGE_TO_AUDIO";
                case I_MEDIA_CHANGE_TO_VIDEO: return "MEDIA_CHANGE_TO_VIDEO";
                case I_OPE_FIRMWARE_UPDATE: return "OPE_FIRMWARE_UPDATE";
                case I_OPE_EVENT_NOTICE   : return "OPE_EVENT_NOTICE";
                case I_OPE_EVENT_COMPANY_NOTICE : return "OPE_EVENT_COMPANY_NOTICE";
                case I_OPE_EVENT_LICENSE_NOTICE : return "OPE_EVENT_LICENSE_NOTICE";
                case I_CONTROL_LOGOUT_REQUEST   : return "CONTROL_LOGOUT_REQUEST";
                case I_WARNING   : return "WARNING";
                case I_APP_UPDATE: return "APP_UPDATE";
                case I_LOCATION_CONTROL_FOR_BG: return "LOCATION_CONTROL_FOR_BG";
            }

            return "UNK(" + code + ")";
        }
    }

    public static class SUBS_TYPE {
        public static final int I_B2C = 0;
        public static final int I_B2B = 1;
        public static final int I_B2B_RENTAL= 2;
        public static final int I_IOT_DEV   = 3;
        public static final int I_COMMANDER = 4;
        public static final int I_C_ADMIN   = 5;
        public static String valueOf(int code) {
            switch (code) {
                case I_B2C : return "B2C";
                case I_B2B : return "B2B";
                case I_B2B_RENTAL: return "B2B_RENTAL";
                case I_IOT_DEV   : return "IOT_DEV";
                case I_COMMANDER : return "COMMANDER";
                case I_C_ADMIN   : return "C_ADMIN";
            }

            return "UNK(" + code + ")";
        }
    }

    public static class CP_NAME_TYPE {
        public static final int I_NOT_USED = 0;
        public static final int I_USE_KO = 1;
        public static final int I_USE_EN = 2;
        public static String valueOf(int code) {
            switch (code) {
                case I_NOT_USED : return "NOT_USED";
                case I_USE_KO   : return "USE_KO";
                case I_USE_EN   : return "USE_EN";
            }

            return "UNK(" + code + ")";
        }
    }

    public static class ONE_HISTORY_REASON_CODE {
        public static final int I_OK   = 0;
        public static final int I_FAIL = 1;
        public static final int I_DENY = 2;
        public static final int I_BUSY = 3;
        public static final int I_NO_ANSWER = 4;
        public static String valueOf(int code) {
            switch (code) {
                case I_OK   : return "OK";
                case I_FAIL : return "FAIL";
                case I_DENY : return "DENY";
                case I_BUSY : return "BUSY";
                case I_NO_ANSWER: return "NO_ANSWER";
            }

            return "UNK(" + code + ")";
        }
    }

    public static class VIEW_TAG_KEY {
        public static final int I_CHANNEL = 1001;
        public static final int I_CHANNEL_GROUP_POSITION = 1002;
        public static String valueOf(int code) {
            switch (code) {
                case I_CHANNEL: return "CHANNEL";
                case I_CHANNEL_GROUP_POSITION: return "CHANNEL_GROUP_POSITION";
            }

            return "UNK(" + code + ")";
        }
    }

    public static class MARKET {
        public static final int I_TEST     = 0;
        public static final int I_TSTORE   = 1;
        public static final int I_GOOGLE   = 2;
        public static final int I_APPLE    = 3;
        public static final int I_ONESTORE = 4;
        public static String valueOf(int code) {
            switch (code) {
                case I_TEST    : return "TEST";
                case I_TSTORE  : return "TSTORE";
                case I_GOOGLE  : return "GOOGLE";
                case I_APPLE   : return "APPLE";
                case I_ONESTORE: return "ONESTORE";
            }

            return "UNK(" + code + ")";
        }
    }


    /*** APPKIND ****************************************/
    public static class APPKIND {
        public static final int I_NORMAL = 0;
        public static final int I_PD     = 1;
        public static final int I_ISW    = 2;
        public static final int I_HYTERA = 3;
        public static final int I_MYSC   = 4;

        public static String valueOf(int code) {
            switch (code) {
                case I_NORMAL: return "NORMAL(" + code + ")";
                case I_PD    : return "PD(" + code + ")";
                case I_ISW   : return "ISW(" + code + ")";
                case I_HYTERA: return "HYTERA(" + code + ")";
                case I_MYSC  : return "MYSC(" + code + ")";
            }

            return "UNK(" + code + ")";
        }
    }

    public static final int		SEE_AGAIN_INVITE_POPUP 	= 0;
    public static final int		DO_NOT_SEE_AGAIN_INVITE_POPUP 	= 1;

}
