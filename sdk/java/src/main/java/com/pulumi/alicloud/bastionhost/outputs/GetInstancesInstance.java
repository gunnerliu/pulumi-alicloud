// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.bastionhost.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetInstancesInstance {
    /**
     * @return The instance&#39;s remark.
     * 
     */
    private final String description;
    /**
     * @return The instance&#39;s id.
     * 
     */
    private final String id;
    /**
     * @return The instance&#39;s status.
     * 
     */
    private final String instanceStatus;
    private final String licenseCode;
    /**
     * @return The instance&#39;s private domain name.
     * 
     */
    private final String privateDomain;
    /**
     * @return The instance&#39;s public domain name.
     * 
     */
    private final String publicDomain;
    /**
     * @return The instance&#39;s public network access configuration.
     * 
     */
    private final Boolean publicNetworkAccess;
    /**
     * @return The instance&#39;s security group configuration.
     * 
     */
    private final List<String> securityGroupIds;
    /**
     * @return A map of tags assigned to the bastionhost instance. It must be in the format:
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.bastionhost.BastionhostFunctions;
     * import com.pulumi.alicloud.bastionhost.inputs.GetInstancesArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var instance = BastionhostFunctions.getInstances(GetInstancesArgs.builder()
     *             .tags(Map.of(&#34;tagKey1&#34;, &#34;tagValue1&#34;))
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    private final @Nullable Map<String,Object> tags;
    /**
     * @return The instance&#39;s vSwitch ID.
     * 
     */
    private final String userVswitchId;

    @CustomType.Constructor
    private GetInstancesInstance(
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("instanceStatus") String instanceStatus,
        @CustomType.Parameter("licenseCode") String licenseCode,
        @CustomType.Parameter("privateDomain") String privateDomain,
        @CustomType.Parameter("publicDomain") String publicDomain,
        @CustomType.Parameter("publicNetworkAccess") Boolean publicNetworkAccess,
        @CustomType.Parameter("securityGroupIds") List<String> securityGroupIds,
        @CustomType.Parameter("tags") @Nullable Map<String,Object> tags,
        @CustomType.Parameter("userVswitchId") String userVswitchId) {
        this.description = description;
        this.id = id;
        this.instanceStatus = instanceStatus;
        this.licenseCode = licenseCode;
        this.privateDomain = privateDomain;
        this.publicDomain = publicDomain;
        this.publicNetworkAccess = publicNetworkAccess;
        this.securityGroupIds = securityGroupIds;
        this.tags = tags;
        this.userVswitchId = userVswitchId;
    }

    /**
     * @return The instance&#39;s remark.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The instance&#39;s id.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The instance&#39;s status.
     * 
     */
    public String instanceStatus() {
        return this.instanceStatus;
    }
    public String licenseCode() {
        return this.licenseCode;
    }
    /**
     * @return The instance&#39;s private domain name.
     * 
     */
    public String privateDomain() {
        return this.privateDomain;
    }
    /**
     * @return The instance&#39;s public domain name.
     * 
     */
    public String publicDomain() {
        return this.publicDomain;
    }
    /**
     * @return The instance&#39;s public network access configuration.
     * 
     */
    public Boolean publicNetworkAccess() {
        return this.publicNetworkAccess;
    }
    /**
     * @return The instance&#39;s security group configuration.
     * 
     */
    public List<String> securityGroupIds() {
        return this.securityGroupIds;
    }
    /**
     * @return A map of tags assigned to the bastionhost instance. It must be in the format:
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.bastionhost.BastionhostFunctions;
     * import com.pulumi.alicloud.bastionhost.inputs.GetInstancesArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var instance = BastionhostFunctions.getInstances(GetInstancesArgs.builder()
     *             .tags(Map.of(&#34;tagKey1&#34;, &#34;tagValue1&#34;))
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public Map<String,Object> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return The instance&#39;s vSwitch ID.
     * 
     */
    public String userVswitchId() {
        return this.userVswitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstancesInstance defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String id;
        private String instanceStatus;
        private String licenseCode;
        private String privateDomain;
        private String publicDomain;
        private Boolean publicNetworkAccess;
        private List<String> securityGroupIds;
        private @Nullable Map<String,Object> tags;
        private String userVswitchId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstancesInstance defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.instanceStatus = defaults.instanceStatus;
    	      this.licenseCode = defaults.licenseCode;
    	      this.privateDomain = defaults.privateDomain;
    	      this.publicDomain = defaults.publicDomain;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.tags = defaults.tags;
    	      this.userVswitchId = defaults.userVswitchId;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder instanceStatus(String instanceStatus) {
            this.instanceStatus = Objects.requireNonNull(instanceStatus);
            return this;
        }
        public Builder licenseCode(String licenseCode) {
            this.licenseCode = Objects.requireNonNull(licenseCode);
            return this;
        }
        public Builder privateDomain(String privateDomain) {
            this.privateDomain = Objects.requireNonNull(privateDomain);
            return this;
        }
        public Builder publicDomain(String publicDomain) {
            this.publicDomain = Objects.requireNonNull(publicDomain);
            return this;
        }
        public Builder publicNetworkAccess(Boolean publicNetworkAccess) {
            this.publicNetworkAccess = Objects.requireNonNull(publicNetworkAccess);
            return this;
        }
        public Builder securityGroupIds(List<String> securityGroupIds) {
            this.securityGroupIds = Objects.requireNonNull(securityGroupIds);
            return this;
        }
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }
        public Builder tags(@Nullable Map<String,Object> tags) {
            this.tags = tags;
            return this;
        }
        public Builder userVswitchId(String userVswitchId) {
            this.userVswitchId = Objects.requireNonNull(userVswitchId);
            return this;
        }        public GetInstancesInstance build() {
            return new GetInstancesInstance(description, id, instanceStatus, licenseCode, privateDomain, publicDomain, publicNetworkAccess, securityGroupIds, tags, userVswitchId);
        }
    }
}
