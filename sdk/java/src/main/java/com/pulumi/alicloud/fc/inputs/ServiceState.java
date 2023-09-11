// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.fc.inputs;

import com.pulumi.alicloud.fc.inputs.ServiceLogConfigArgs;
import com.pulumi.alicloud.fc.inputs.ServiceNasConfigArgs;
import com.pulumi.alicloud.fc.inputs.ServiceTracingConfigArgs;
import com.pulumi.alicloud.fc.inputs.ServiceVpcConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceState extends com.pulumi.resources.ResourceArgs {

    public static final ServiceState Empty = new ServiceState();

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="internetAccess")
    private @Nullable Output<Boolean> internetAccess;

    public Optional<Output<Boolean>> internetAccess() {
        return Optional.ofNullable(this.internetAccess);
    }

    @Import(name="lastModified")
    private @Nullable Output<String> lastModified;

    public Optional<Output<String>> lastModified() {
        return Optional.ofNullable(this.lastModified);
    }

    @Import(name="logConfig")
    private @Nullable Output<ServiceLogConfigArgs> logConfig;

    public Optional<Output<ServiceLogConfigArgs>> logConfig() {
        return Optional.ofNullable(this.logConfig);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="namePrefix")
    private @Nullable Output<String> namePrefix;

    public Optional<Output<String>> namePrefix() {
        return Optional.ofNullable(this.namePrefix);
    }

    @Import(name="nasConfig")
    private @Nullable Output<ServiceNasConfigArgs> nasConfig;

    public Optional<Output<ServiceNasConfigArgs>> nasConfig() {
        return Optional.ofNullable(this.nasConfig);
    }

    @Import(name="publish")
    private @Nullable Output<Boolean> publish;

    public Optional<Output<Boolean>> publish() {
        return Optional.ofNullable(this.publish);
    }

    @Import(name="role")
    private @Nullable Output<String> role;

    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    @Import(name="serviceId")
    private @Nullable Output<String> serviceId;

    public Optional<Output<String>> serviceId() {
        return Optional.ofNullable(this.serviceId);
    }

    @Import(name="tracingConfig")
    private @Nullable Output<ServiceTracingConfigArgs> tracingConfig;

    public Optional<Output<ServiceTracingConfigArgs>> tracingConfig() {
        return Optional.ofNullable(this.tracingConfig);
    }

    @Import(name="version")
    private @Nullable Output<String> version;

    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    @Import(name="vpcConfig")
    private @Nullable Output<ServiceVpcConfigArgs> vpcConfig;

    public Optional<Output<ServiceVpcConfigArgs>> vpcConfig() {
        return Optional.ofNullable(this.vpcConfig);
    }

    private ServiceState() {}

    private ServiceState(ServiceState $) {
        this.description = $.description;
        this.internetAccess = $.internetAccess;
        this.lastModified = $.lastModified;
        this.logConfig = $.logConfig;
        this.name = $.name;
        this.namePrefix = $.namePrefix;
        this.nasConfig = $.nasConfig;
        this.publish = $.publish;
        this.role = $.role;
        this.serviceId = $.serviceId;
        this.tracingConfig = $.tracingConfig;
        this.version = $.version;
        this.vpcConfig = $.vpcConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceState $;

        public Builder() {
            $ = new ServiceState();
        }

        public Builder(ServiceState defaults) {
            $ = new ServiceState(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder internetAccess(@Nullable Output<Boolean> internetAccess) {
            $.internetAccess = internetAccess;
            return this;
        }

        public Builder internetAccess(Boolean internetAccess) {
            return internetAccess(Output.of(internetAccess));
        }

        public Builder lastModified(@Nullable Output<String> lastModified) {
            $.lastModified = lastModified;
            return this;
        }

        public Builder lastModified(String lastModified) {
            return lastModified(Output.of(lastModified));
        }

        public Builder logConfig(@Nullable Output<ServiceLogConfigArgs> logConfig) {
            $.logConfig = logConfig;
            return this;
        }

        public Builder logConfig(ServiceLogConfigArgs logConfig) {
            return logConfig(Output.of(logConfig));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder namePrefix(@Nullable Output<String> namePrefix) {
            $.namePrefix = namePrefix;
            return this;
        }

        public Builder namePrefix(String namePrefix) {
            return namePrefix(Output.of(namePrefix));
        }

        public Builder nasConfig(@Nullable Output<ServiceNasConfigArgs> nasConfig) {
            $.nasConfig = nasConfig;
            return this;
        }

        public Builder nasConfig(ServiceNasConfigArgs nasConfig) {
            return nasConfig(Output.of(nasConfig));
        }

        public Builder publish(@Nullable Output<Boolean> publish) {
            $.publish = publish;
            return this;
        }

        public Builder publish(Boolean publish) {
            return publish(Output.of(publish));
        }

        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        public Builder role(String role) {
            return role(Output.of(role));
        }

        public Builder serviceId(@Nullable Output<String> serviceId) {
            $.serviceId = serviceId;
            return this;
        }

        public Builder serviceId(String serviceId) {
            return serviceId(Output.of(serviceId));
        }

        public Builder tracingConfig(@Nullable Output<ServiceTracingConfigArgs> tracingConfig) {
            $.tracingConfig = tracingConfig;
            return this;
        }

        public Builder tracingConfig(ServiceTracingConfigArgs tracingConfig) {
            return tracingConfig(Output.of(tracingConfig));
        }

        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        public Builder version(String version) {
            return version(Output.of(version));
        }

        public Builder vpcConfig(@Nullable Output<ServiceVpcConfigArgs> vpcConfig) {
            $.vpcConfig = vpcConfig;
            return this;
        }

        public Builder vpcConfig(ServiceVpcConfigArgs vpcConfig) {
            return vpcConfig(Output.of(vpcConfig));
        }

        public ServiceState build() {
            return $;
        }
    }

}
