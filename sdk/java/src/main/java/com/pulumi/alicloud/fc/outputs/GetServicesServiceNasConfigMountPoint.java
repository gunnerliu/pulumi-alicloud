// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.fc.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServicesServiceNasConfigMountPoint {
    /**
     * @return The local address where to mount your remote NAS directory.
     * 
     */
    private String mountDir;
    /**
     * @return The address of the remote NAS directory.
     * 
     */
    private String serverAddr;

    private GetServicesServiceNasConfigMountPoint() {}
    /**
     * @return The local address where to mount your remote NAS directory.
     * 
     */
    public String mountDir() {
        return this.mountDir;
    }
    /**
     * @return The address of the remote NAS directory.
     * 
     */
    public String serverAddr() {
        return this.serverAddr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServicesServiceNasConfigMountPoint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String mountDir;
        private String serverAddr;
        public Builder() {}
        public Builder(GetServicesServiceNasConfigMountPoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mountDir = defaults.mountDir;
    	      this.serverAddr = defaults.serverAddr;
        }

        @CustomType.Setter
        public Builder mountDir(String mountDir) {
            this.mountDir = Objects.requireNonNull(mountDir);
            return this;
        }
        @CustomType.Setter
        public Builder serverAddr(String serverAddr) {
            this.serverAddr = Objects.requireNonNull(serverAddr);
            return this;
        }
        public GetServicesServiceNasConfigMountPoint build() {
            final var o = new GetServicesServiceNasConfigMountPoint();
            o.mountDir = mountDir;
            o.serverAddr = serverAddr;
            return o;
        }
    }
}