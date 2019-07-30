package com.fit2cloud.netty.dao;

import com.fit2cloud.netty.model.User;
import com.fit2cloud.netty.model.UserExample;
import com.fit2cloud.netty.model.UserExample.Criteria;
import com.fit2cloud.netty.model.UserExample.Criterion;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;
import java.util.Map;

public class UserSqlProvider {

    public String countByExample(UserExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("user");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(UserExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("user");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(User record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("user");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            sql.VALUES("email", "#{email,jdbcType=VARCHAR}");
        }
        
        if (record.getSource() != null) {
            sql.VALUES("source", "#{source,jdbcType=VARCHAR}");
        }
        
        if (record.getAccessToken() != null) {
            sql.VALUES("access_token", "#{accessToken,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=VARCHAR}");
        }
        
        if (record.getCreated() != null) {
            sql.VALUES("created", "#{created,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAdmin() != null) {
            sql.VALUES("admin", "#{admin,jdbcType=BIT}");
        }
        
        if (record.getCompany() != null) {
            sql.VALUES("company", "#{company,jdbcType=VARCHAR}");
        }
        
        if (record.getPhone() != null) {
            sql.VALUES("phone", "#{phone,jdbcType=BIGINT}");
        }
        
        if (record.getActiveCode() != null) {
            sql.VALUES("active_code", "#{activeCode,jdbcType=VARCHAR}");
        }
        
        if (record.getActiveTimeout() != null) {
            sql.VALUES("active_timeout", "#{activeTimeout,jdbcType=TIMESTAMP}");
        }
        
        if (record.getForgetCode() != null) {
            sql.VALUES("forget_code", "#{forgetCode,jdbcType=VARCHAR}");
        }
        
        if (record.getForgetTimeout() != null) {
            sql.VALUES("forget_timeout", "#{forgetTimeout,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLastLogin() != null) {
            sql.VALUES("last_login", "#{lastLogin,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDescription() != null) {
            sql.VALUES("description", "#{description,jdbcType=VARCHAR}");
        }
        
        if (record.getLdapId() != null) {
            sql.VALUES("ldap_id", "#{ldapId,jdbcType=VARCHAR}");
        }
        
        if (record.getStaffId() != null) {
            sql.VALUES("staff_id", "#{staffId,jdbcType=VARCHAR}");
        }
        
        if (record.getLastMode() != null) {
            sql.VALUES("last_mode", "#{lastMode,jdbcType=VARCHAR}");
        }
        
        if (record.getCurrentGroupId() != null) {
            sql.VALUES("current_group_id", "#{currentGroupId,jdbcType=BIGINT}");
        }
        
        if (record.getUserType() != null) {
            sql.VALUES("user_type", "#{userType,jdbcType=INTEGER}");
        }
        
        if (record.getCostCenterId() != null) {
            sql.VALUES("cost_center_id", "#{costCenterId,jdbcType=BIGINT}");
        }
        
        return sql.toString();
    }

    public String selectByExample(UserExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("name");
        sql.SELECT("email");
        sql.SELECT("source");
        sql.SELECT("access_token");
        sql.SELECT("status");
        sql.SELECT("created");
        sql.SELECT("admin");
        sql.SELECT("company");
        sql.SELECT("phone");
        sql.SELECT("active_code");
        sql.SELECT("active_timeout");
        sql.SELECT("forget_code");
        sql.SELECT("forget_timeout");
        sql.SELECT("last_login");
        sql.SELECT("description");
        sql.SELECT("ldap_id");
        sql.SELECT("staff_id");
        sql.SELECT("last_mode");
        sql.SELECT("current_group_id");
        sql.SELECT("user_type");
        sql.SELECT("cost_center_id");
        sql.FROM("user");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        User record = (User) parameter.get("record");
        UserExample example = (UserExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("user");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getName() != null) {
            sql.SET("name = #{record.name,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            sql.SET("email = #{record.email,jdbcType=VARCHAR}");
        }
        
        if (record.getSource() != null) {
            sql.SET("source = #{record.source,jdbcType=VARCHAR}");
        }
        
        if (record.getAccessToken() != null) {
            sql.SET("access_token = #{record.accessToken,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{record.status,jdbcType=VARCHAR}");
        }
        
        if (record.getCreated() != null) {
            sql.SET("created = #{record.created,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAdmin() != null) {
            sql.SET("admin = #{record.admin,jdbcType=BIT}");
        }
        
        if (record.getCompany() != null) {
            sql.SET("company = #{record.company,jdbcType=VARCHAR}");
        }
        
        if (record.getPhone() != null) {
            sql.SET("phone = #{record.phone,jdbcType=BIGINT}");
        }
        
        if (record.getActiveCode() != null) {
            sql.SET("active_code = #{record.activeCode,jdbcType=VARCHAR}");
        }
        
        if (record.getActiveTimeout() != null) {
            sql.SET("active_timeout = #{record.activeTimeout,jdbcType=TIMESTAMP}");
        }
        
        if (record.getForgetCode() != null) {
            sql.SET("forget_code = #{record.forgetCode,jdbcType=VARCHAR}");
        }
        
        if (record.getForgetTimeout() != null) {
            sql.SET("forget_timeout = #{record.forgetTimeout,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLastLogin() != null) {
            sql.SET("last_login = #{record.lastLogin,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDescription() != null) {
            sql.SET("description = #{record.description,jdbcType=VARCHAR}");
        }
        
        if (record.getLdapId() != null) {
            sql.SET("ldap_id = #{record.ldapId,jdbcType=VARCHAR}");
        }
        
        if (record.getStaffId() != null) {
            sql.SET("staff_id = #{record.staffId,jdbcType=VARCHAR}");
        }
        
        if (record.getLastMode() != null) {
            sql.SET("last_mode = #{record.lastMode,jdbcType=VARCHAR}");
        }
        
        if (record.getCurrentGroupId() != null) {
            sql.SET("current_group_id = #{record.currentGroupId,jdbcType=BIGINT}");
        }
        
        if (record.getUserType() != null) {
            sql.SET("user_type = #{record.userType,jdbcType=INTEGER}");
        }
        
        if (record.getCostCenterId() != null) {
            sql.SET("cost_center_id = #{record.costCenterId,jdbcType=BIGINT}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("user");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("name = #{record.name,jdbcType=VARCHAR}");
        sql.SET("email = #{record.email,jdbcType=VARCHAR}");
        sql.SET("source = #{record.source,jdbcType=VARCHAR}");
        sql.SET("access_token = #{record.accessToken,jdbcType=VARCHAR}");
        sql.SET("status = #{record.status,jdbcType=VARCHAR}");
        sql.SET("created = #{record.created,jdbcType=TIMESTAMP}");
        sql.SET("admin = #{record.admin,jdbcType=BIT}");
        sql.SET("company = #{record.company,jdbcType=VARCHAR}");
        sql.SET("phone = #{record.phone,jdbcType=BIGINT}");
        sql.SET("active_code = #{record.activeCode,jdbcType=VARCHAR}");
        sql.SET("active_timeout = #{record.activeTimeout,jdbcType=TIMESTAMP}");
        sql.SET("forget_code = #{record.forgetCode,jdbcType=VARCHAR}");
        sql.SET("forget_timeout = #{record.forgetTimeout,jdbcType=TIMESTAMP}");
        sql.SET("last_login = #{record.lastLogin,jdbcType=TIMESTAMP}");
        sql.SET("description = #{record.description,jdbcType=VARCHAR}");
        sql.SET("ldap_id = #{record.ldapId,jdbcType=VARCHAR}");
        sql.SET("staff_id = #{record.staffId,jdbcType=VARCHAR}");
        sql.SET("last_mode = #{record.lastMode,jdbcType=VARCHAR}");
        sql.SET("current_group_id = #{record.currentGroupId,jdbcType=BIGINT}");
        sql.SET("user_type = #{record.userType,jdbcType=INTEGER}");
        sql.SET("cost_center_id = #{record.costCenterId,jdbcType=BIGINT}");
        
        UserExample example = (UserExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(User record) {
        SQL sql = new SQL();
        sql.UPDATE("user");
        
        if (record.getName() != null) {
            sql.SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            sql.SET("email = #{email,jdbcType=VARCHAR}");
        }
        
        if (record.getSource() != null) {
            sql.SET("source = #{source,jdbcType=VARCHAR}");
        }
        
        if (record.getAccessToken() != null) {
            sql.SET("access_token = #{accessToken,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=VARCHAR}");
        }
        
        if (record.getCreated() != null) {
            sql.SET("created = #{created,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAdmin() != null) {
            sql.SET("admin = #{admin,jdbcType=BIT}");
        }
        
        if (record.getCompany() != null) {
            sql.SET("company = #{company,jdbcType=VARCHAR}");
        }
        
        if (record.getPhone() != null) {
            sql.SET("phone = #{phone,jdbcType=BIGINT}");
        }
        
        if (record.getActiveCode() != null) {
            sql.SET("active_code = #{activeCode,jdbcType=VARCHAR}");
        }
        
        if (record.getActiveTimeout() != null) {
            sql.SET("active_timeout = #{activeTimeout,jdbcType=TIMESTAMP}");
        }
        
        if (record.getForgetCode() != null) {
            sql.SET("forget_code = #{forgetCode,jdbcType=VARCHAR}");
        }
        
        if (record.getForgetTimeout() != null) {
            sql.SET("forget_timeout = #{forgetTimeout,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLastLogin() != null) {
            sql.SET("last_login = #{lastLogin,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDescription() != null) {
            sql.SET("description = #{description,jdbcType=VARCHAR}");
        }
        
        if (record.getLdapId() != null) {
            sql.SET("ldap_id = #{ldapId,jdbcType=VARCHAR}");
        }
        
        if (record.getStaffId() != null) {
            sql.SET("staff_id = #{staffId,jdbcType=VARCHAR}");
        }
        
        if (record.getLastMode() != null) {
            sql.SET("last_mode = #{lastMode,jdbcType=VARCHAR}");
        }
        
        if (record.getCurrentGroupId() != null) {
            sql.SET("current_group_id = #{currentGroupId,jdbcType=BIGINT}");
        }
        
        if (record.getUserType() != null) {
            sql.SET("user_type = #{userType,jdbcType=INTEGER}");
        }
        
        if (record.getCostCenterId() != null) {
            sql.SET("cost_center_id = #{costCenterId,jdbcType=BIGINT}");
        }
        
        sql.WHERE("id = #{id,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, UserExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}