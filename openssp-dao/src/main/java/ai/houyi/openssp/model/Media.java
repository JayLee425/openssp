package ai.houyi.openssp.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Media {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column media.id
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column media.uuid
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    private String uuid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column media.publisher_id
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    private Integer publisherId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column media.name
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column media.type
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column media.status
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column media.create_time
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column media.update_time
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column media.id
     *
     * @return the value of media.id
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column media.id
     *
     * @param id the value for media.id
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column media.uuid
     *
     * @return the value of media.uuid
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column media.uuid
     *
     * @param uuid the value for media.uuid
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column media.publisher_id
     *
     * @return the value of media.publisher_id
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    public Integer getPublisherId() {
        return publisherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column media.publisher_id
     *
     * @param publisherId the value for media.publisher_id
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    public void setPublisherId(Integer publisherId) {
        this.publisherId = publisherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column media.name
     *
     * @return the value of media.name
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column media.name
     *
     * @param name the value for media.name
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column media.type
     *
     * @return the value of media.type
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column media.type
     *
     * @param type the value for media.type
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column media.status
     *
     * @return the value of media.status
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column media.status
     *
     * @param status the value for media.status
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column media.create_time
     *
     * @return the value of media.create_time
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column media.create_time
     *
     * @param createTime the value for media.create_time
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column media.update_time
     *
     * @return the value of media.update_time
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column media.update_time
     *
     * @param updateTime the value for media.update_time
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table media
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static Media.Builder builder() {
        return new Media.Builder();
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table media
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static class Builder {
        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table media
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private Media obj;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table media
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder() {
            this.obj = new Media();
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column media.id
         *
         * @param id the value for media.id
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder id(Integer id) {
            obj.setId(id);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column media.uuid
         *
         * @param uuid the value for media.uuid
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder uuid(String uuid) {
            obj.setUuid(uuid);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column media.publisher_id
         *
         * @param publisherId the value for media.publisher_id
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder publisherId(Integer publisherId) {
            obj.setPublisherId(publisherId);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column media.name
         *
         * @param name the value for media.name
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder name(String name) {
            obj.setName(name);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column media.type
         *
         * @param type the value for media.type
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder type(Integer type) {
            obj.setType(type);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column media.status
         *
         * @param status the value for media.status
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder status(Integer status) {
            obj.setStatus(status);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column media.create_time
         *
         * @param createTime the value for media.create_time
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder createTime(Date createTime) {
            obj.setCreateTime(createTime);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column media.update_time
         *
         * @param updateTime the value for media.update_time
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder updateTime(Date updateTime) {
            obj.setUpdateTime(updateTime);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table media
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Media build() {
            return this.obj;
        }
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table media
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        uuid("uuid", "uuid", "VARCHAR", false),
        publisherId("publisher_id", "publisherId", "INTEGER", false),
        name("name", "name", "VARCHAR", false),
        type("type", "type", "INTEGER", false),
        status("status", "status", "INTEGER", false),
        createTime("create_time", "createTime", "TIMESTAMP", false),
        updateTime("update_time", "updateTime", "TIMESTAMP", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table media
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String BEGINNING_DELIMITER = "\"";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table media
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String ENDING_DELIMITER = "\"";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table media
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table media
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table media
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table media
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table media
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table media
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table media
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table media
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table media
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table media
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table media
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table media
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table media
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }
    }
}