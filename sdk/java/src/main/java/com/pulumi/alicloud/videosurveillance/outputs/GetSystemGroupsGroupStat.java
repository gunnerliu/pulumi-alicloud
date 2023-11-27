// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.videosurveillance.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSystemGroupsGroupStat {
    /**
     * @return The total number of devices in the group.
     * 
     */
    private String deviceNum;
    /**
     * @return The total number of smart devices in the group.
     * 
     */
    private String iedNum;
    /**
     * @return The total number of cameras in the group.
     * 
     */
    private String ipcNum;
    /**
     * @return The total number of platforms in the group.
     * 
     */
    private String platformNum;

    private GetSystemGroupsGroupStat() {}
    /**
     * @return The total number of devices in the group.
     * 
     */
    public String deviceNum() {
        return this.deviceNum;
    }
    /**
     * @return The total number of smart devices in the group.
     * 
     */
    public String iedNum() {
        return this.iedNum;
    }
    /**
     * @return The total number of cameras in the group.
     * 
     */
    public String ipcNum() {
        return this.ipcNum;
    }
    /**
     * @return The total number of platforms in the group.
     * 
     */
    public String platformNum() {
        return this.platformNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSystemGroupsGroupStat defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String deviceNum;
        private String iedNum;
        private String ipcNum;
        private String platformNum;
        public Builder() {}
        public Builder(GetSystemGroupsGroupStat defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceNum = defaults.deviceNum;
    	      this.iedNum = defaults.iedNum;
    	      this.ipcNum = defaults.ipcNum;
    	      this.platformNum = defaults.platformNum;
        }

        @CustomType.Setter
        public Builder deviceNum(String deviceNum) {
            this.deviceNum = Objects.requireNonNull(deviceNum);
            return this;
        }
        @CustomType.Setter
        public Builder iedNum(String iedNum) {
            this.iedNum = Objects.requireNonNull(iedNum);
            return this;
        }
        @CustomType.Setter
        public Builder ipcNum(String ipcNum) {
            this.ipcNum = Objects.requireNonNull(ipcNum);
            return this;
        }
        @CustomType.Setter
        public Builder platformNum(String platformNum) {
            this.platformNum = Objects.requireNonNull(platformNum);
            return this;
        }
        public GetSystemGroupsGroupStat build() {
            final var _resultValue = new GetSystemGroupsGroupStat();
            _resultValue.deviceNum = deviceNum;
            _resultValue.iedNum = iedNum;
            _resultValue.ipcNum = ipcNum;
            _resultValue.platformNum = platformNum;
            return _resultValue;
        }
    }
}
