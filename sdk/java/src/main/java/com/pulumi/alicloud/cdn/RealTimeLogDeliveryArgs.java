// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cdn;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class RealTimeLogDeliveryArgs extends com.pulumi.resources.ResourceArgs {

    public static final RealTimeLogDeliveryArgs Empty = new RealTimeLogDeliveryArgs();

    /**
     * The accelerated domain name for which you want to configure real-time log delivery. You can specify multiple domain names and separate them with commas (,).
     * 
     */
    @Import(name="domain", required=true)
    private Output<String> domain;

    /**
     * @return The accelerated domain name for which you want to configure real-time log delivery. You can specify multiple domain names and separate them with commas (,).
     * 
     */
    public Output<String> domain() {
        return this.domain;
    }

    /**
     * The name of the Logstore that collects log data from Alibaba Cloud Content Delivery Network (CDN) in real time.
     * 
     */
    @Import(name="logstore", required=true)
    private Output<String> logstore;

    /**
     * @return The name of the Logstore that collects log data from Alibaba Cloud Content Delivery Network (CDN) in real time.
     * 
     */
    public Output<String> logstore() {
        return this.logstore;
    }

    /**
     * The name of the Log Service project that is used for real-time log delivery.
     * 
     */
    @Import(name="project", required=true)
    private Output<String> project;

    /**
     * @return The name of the Log Service project that is used for real-time log delivery.
     * 
     */
    public Output<String> project() {
        return this.project;
    }

    /**
     * The region where the Log Service project is deployed.
     * 
     * &gt; **NOTE:** If your Project and Logstore services already exist, if you continue to create existing content, the created content will overwrite your existing indexes and custom reports. Please be careful to create your existing services to avoid affecting your online services after coverage.
     * 
     */
    @Import(name="slsRegion", required=true)
    private Output<String> slsRegion;

    /**
     * @return The region where the Log Service project is deployed.
     * 
     * &gt; **NOTE:** If your Project and Logstore services already exist, if you continue to create existing content, the created content will overwrite your existing indexes and custom reports. Please be careful to create your existing services to avoid affecting your online services after coverage.
     * 
     */
    public Output<String> slsRegion() {
        return this.slsRegion;
    }

    private RealTimeLogDeliveryArgs() {}

    private RealTimeLogDeliveryArgs(RealTimeLogDeliveryArgs $) {
        this.domain = $.domain;
        this.logstore = $.logstore;
        this.project = $.project;
        this.slsRegion = $.slsRegion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RealTimeLogDeliveryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RealTimeLogDeliveryArgs $;

        public Builder() {
            $ = new RealTimeLogDeliveryArgs();
        }

        public Builder(RealTimeLogDeliveryArgs defaults) {
            $ = new RealTimeLogDeliveryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param domain The accelerated domain name for which you want to configure real-time log delivery. You can specify multiple domain names and separate them with commas (,).
         * 
         * @return builder
         * 
         */
        public Builder domain(Output<String> domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param domain The accelerated domain name for which you want to configure real-time log delivery. You can specify multiple domain names and separate them with commas (,).
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        /**
         * @param logstore The name of the Logstore that collects log data from Alibaba Cloud Content Delivery Network (CDN) in real time.
         * 
         * @return builder
         * 
         */
        public Builder logstore(Output<String> logstore) {
            $.logstore = logstore;
            return this;
        }

        /**
         * @param logstore The name of the Logstore that collects log data from Alibaba Cloud Content Delivery Network (CDN) in real time.
         * 
         * @return builder
         * 
         */
        public Builder logstore(String logstore) {
            return logstore(Output.of(logstore));
        }

        /**
         * @param project The name of the Log Service project that is used for real-time log delivery.
         * 
         * @return builder
         * 
         */
        public Builder project(Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The name of the Log Service project that is used for real-time log delivery.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param slsRegion The region where the Log Service project is deployed.
         * 
         * &gt; **NOTE:** If your Project and Logstore services already exist, if you continue to create existing content, the created content will overwrite your existing indexes and custom reports. Please be careful to create your existing services to avoid affecting your online services after coverage.
         * 
         * @return builder
         * 
         */
        public Builder slsRegion(Output<String> slsRegion) {
            $.slsRegion = slsRegion;
            return this;
        }

        /**
         * @param slsRegion The region where the Log Service project is deployed.
         * 
         * &gt; **NOTE:** If your Project and Logstore services already exist, if you continue to create existing content, the created content will overwrite your existing indexes and custom reports. Please be careful to create your existing services to avoid affecting your online services after coverage.
         * 
         * @return builder
         * 
         */
        public Builder slsRegion(String slsRegion) {
            return slsRegion(Output.of(slsRegion));
        }

        public RealTimeLogDeliveryArgs build() {
            $.domain = Objects.requireNonNull($.domain, "expected parameter 'domain' to be non-null");
            $.logstore = Objects.requireNonNull($.logstore, "expected parameter 'logstore' to be non-null");
            $.project = Objects.requireNonNull($.project, "expected parameter 'project' to be non-null");
            $.slsRegion = Objects.requireNonNull($.slsRegion, "expected parameter 'slsRegion' to be non-null");
            return $;
        }
    }

}
