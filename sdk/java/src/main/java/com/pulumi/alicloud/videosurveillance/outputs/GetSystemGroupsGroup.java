// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.videosurveillance.outputs;

import com.pulumi.alicloud.videosurveillance.outputs.GetSystemGroupsGroupStat;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSystemGroupsGroup {
    /**
     * @return The App Name of Group.
     * 
     */
    private final String app;
    /**
     * @return The space within the device status update of the callback, need to start with http:// or https:// at the beginning.
     * 
     */
    private final String callback;
    /**
     * @return The creation time of the Group.
     * 
     */
    private final String createTime;
    /**
     * @return The description of the Group.
     * 
     */
    private final String description;
    /**
     * @return Whether to open Group.
     * 
     */
    private final Boolean enabled;
    /**
     * @return Space of national standard ID. **NOTE:** Available only in the national standard access space.
     * 
     */
    private final String gbId;
    /**
     * @return Space of national standard signaling server address. **NOTE:** Available only in the national standard access space.
     * 
     */
    private final String gbIp;
    /**
     * @return The ID of Group.
     * 
     */
    private final String groupId;
    /**
     * @return The name of Group.
     * 
     */
    private final String groupName;
    /**
     * @return The ID of the Group.
     * 
     */
    private final String id;
    /**
     * @return The use of the access protocol support `gb28181`,`rtmp`(Real Time Messaging Protocol).
     * 
     */
    private final String inProtocol;
    /**
     * @return The use of space play Protocol multi-valued separate them with commas (,). Valid values: `flv`,`hls`, `rtmp`(Real Time Messaging Protocol).
     * 
     */
    private final String outProtocol;
    /**
     * @return The domain name of plan streaming used by the group.
     * 
     */
    private final String playDomain;
    /**
     * @return The domain name of push streaming used by the group.
     * 
     */
    private final String pushDomain;
    /**
     * @return The Device statistics of Group.
     * 
     */
    private final List<GetSystemGroupsGroupStat> stats;

    @CustomType.Constructor
    private GetSystemGroupsGroup(
        @CustomType.Parameter("app") String app,
        @CustomType.Parameter("callback") String callback,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("enabled") Boolean enabled,
        @CustomType.Parameter("gbId") String gbId,
        @CustomType.Parameter("gbIp") String gbIp,
        @CustomType.Parameter("groupId") String groupId,
        @CustomType.Parameter("groupName") String groupName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("inProtocol") String inProtocol,
        @CustomType.Parameter("outProtocol") String outProtocol,
        @CustomType.Parameter("playDomain") String playDomain,
        @CustomType.Parameter("pushDomain") String pushDomain,
        @CustomType.Parameter("stats") List<GetSystemGroupsGroupStat> stats) {
        this.app = app;
        this.callback = callback;
        this.createTime = createTime;
        this.description = description;
        this.enabled = enabled;
        this.gbId = gbId;
        this.gbIp = gbIp;
        this.groupId = groupId;
        this.groupName = groupName;
        this.id = id;
        this.inProtocol = inProtocol;
        this.outProtocol = outProtocol;
        this.playDomain = playDomain;
        this.pushDomain = pushDomain;
        this.stats = stats;
    }

    /**
     * @return The App Name of Group.
     * 
     */
    public String app() {
        return this.app;
    }
    /**
     * @return The space within the device status update of the callback, need to start with http:// or https:// at the beginning.
     * 
     */
    public String callback() {
        return this.callback;
    }
    /**
     * @return The creation time of the Group.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The description of the Group.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Whether to open Group.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return Space of national standard ID. **NOTE:** Available only in the national standard access space.
     * 
     */
    public String gbId() {
        return this.gbId;
    }
    /**
     * @return Space of national standard signaling server address. **NOTE:** Available only in the national standard access space.
     * 
     */
    public String gbIp() {
        return this.gbIp;
    }
    /**
     * @return The ID of Group.
     * 
     */
    public String groupId() {
        return this.groupId;
    }
    /**
     * @return The name of Group.
     * 
     */
    public String groupName() {
        return this.groupName;
    }
    /**
     * @return The ID of the Group.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The use of the access protocol support `gb28181`,`rtmp`(Real Time Messaging Protocol).
     * 
     */
    public String inProtocol() {
        return this.inProtocol;
    }
    /**
     * @return The use of space play Protocol multi-valued separate them with commas (,). Valid values: `flv`,`hls`, `rtmp`(Real Time Messaging Protocol).
     * 
     */
    public String outProtocol() {
        return this.outProtocol;
    }
    /**
     * @return The domain name of plan streaming used by the group.
     * 
     */
    public String playDomain() {
        return this.playDomain;
    }
    /**
     * @return The domain name of push streaming used by the group.
     * 
     */
    public String pushDomain() {
        return this.pushDomain;
    }
    /**
     * @return The Device statistics of Group.
     * 
     */
    public List<GetSystemGroupsGroupStat> stats() {
        return this.stats;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSystemGroupsGroup defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String app;
        private String callback;
        private String createTime;
        private String description;
        private Boolean enabled;
        private String gbId;
        private String gbIp;
        private String groupId;
        private String groupName;
        private String id;
        private String inProtocol;
        private String outProtocol;
        private String playDomain;
        private String pushDomain;
        private List<GetSystemGroupsGroupStat> stats;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSystemGroupsGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.app = defaults.app;
    	      this.callback = defaults.callback;
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.enabled = defaults.enabled;
    	      this.gbId = defaults.gbId;
    	      this.gbIp = defaults.gbIp;
    	      this.groupId = defaults.groupId;
    	      this.groupName = defaults.groupName;
    	      this.id = defaults.id;
    	      this.inProtocol = defaults.inProtocol;
    	      this.outProtocol = defaults.outProtocol;
    	      this.playDomain = defaults.playDomain;
    	      this.pushDomain = defaults.pushDomain;
    	      this.stats = defaults.stats;
        }

        public Builder app(String app) {
            this.app = Objects.requireNonNull(app);
            return this;
        }
        public Builder callback(String callback) {
            this.callback = Objects.requireNonNull(callback);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder gbId(String gbId) {
            this.gbId = Objects.requireNonNull(gbId);
            return this;
        }
        public Builder gbIp(String gbIp) {
            this.gbIp = Objects.requireNonNull(gbIp);
            return this;
        }
        public Builder groupId(String groupId) {
            this.groupId = Objects.requireNonNull(groupId);
            return this;
        }
        public Builder groupName(String groupName) {
            this.groupName = Objects.requireNonNull(groupName);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder inProtocol(String inProtocol) {
            this.inProtocol = Objects.requireNonNull(inProtocol);
            return this;
        }
        public Builder outProtocol(String outProtocol) {
            this.outProtocol = Objects.requireNonNull(outProtocol);
            return this;
        }
        public Builder playDomain(String playDomain) {
            this.playDomain = Objects.requireNonNull(playDomain);
            return this;
        }
        public Builder pushDomain(String pushDomain) {
            this.pushDomain = Objects.requireNonNull(pushDomain);
            return this;
        }
        public Builder stats(List<GetSystemGroupsGroupStat> stats) {
            this.stats = Objects.requireNonNull(stats);
            return this;
        }
        public Builder stats(GetSystemGroupsGroupStat... stats) {
            return stats(List.of(stats));
        }        public GetSystemGroupsGroup build() {
            return new GetSystemGroupsGroup(app, callback, createTime, description, enabled, gbId, gbIp, groupId, groupName, id, inProtocol, outProtocol, playDomain, pushDomain, stats);
        }
    }
}
