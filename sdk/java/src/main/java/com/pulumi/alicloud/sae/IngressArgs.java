// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sae;

import com.pulumi.alicloud.sae.inputs.IngressDefaultRuleArgs;
import com.pulumi.alicloud.sae.inputs.IngressRuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IngressArgs extends com.pulumi.resources.ResourceArgs {

    public static final IngressArgs Empty = new IngressArgs();

    /**
     * Cert Id.
     * 
     */
    @Import(name="certId")
    private @Nullable Output<String> certId;

    /**
     * @return Cert Id.
     * 
     */
    public Optional<Output<String>> certId() {
        return Optional.ofNullable(this.certId);
    }

    /**
     * Default Rule.
     * 
     */
    @Import(name="defaultRule")
    private @Nullable Output<IngressDefaultRuleArgs> defaultRule;

    /**
     * @return Default Rule.
     * 
     */
    public Optional<Output<IngressDefaultRuleArgs>> defaultRule() {
        return Optional.ofNullable(this.defaultRule);
    }

    /**
     * Description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * SLB listening port.
     * 
     */
    @Import(name="listenerPort", required=true)
    private Output<Integer> listenerPort;

    /**
     * @return SLB listening port.
     * 
     */
    public Output<Integer> listenerPort() {
        return this.listenerPort;
    }

    /**
     * The Id of Namespace.It can contain 2 to 32 lowercase characters.The value is in format `{RegionId}:{namespace}`
     * 
     */
    @Import(name="namespaceId", required=true)
    private Output<String> namespaceId;

    /**
     * @return The Id of Namespace.It can contain 2 to 32 lowercase characters.The value is in format `{RegionId}:{namespace}`
     * 
     */
    public Output<String> namespaceId() {
        return this.namespaceId;
    }

    /**
     * Forwarding rules. Forward traffic to the specified application according to the domain name and path.
     * 
     */
    @Import(name="rules", required=true)
    private Output<List<IngressRuleArgs>> rules;

    /**
     * @return Forwarding rules. Forward traffic to the specified application according to the domain name and path.
     * 
     */
    public Output<List<IngressRuleArgs>> rules() {
        return this.rules;
    }

    /**
     * SLB ID.
     * 
     */
    @Import(name="slbId", required=true)
    private Output<String> slbId;

    /**
     * @return SLB ID.
     * 
     */
    public Output<String> slbId() {
        return this.slbId;
    }

    private IngressArgs() {}

    private IngressArgs(IngressArgs $) {
        this.certId = $.certId;
        this.defaultRule = $.defaultRule;
        this.description = $.description;
        this.listenerPort = $.listenerPort;
        this.namespaceId = $.namespaceId;
        this.rules = $.rules;
        this.slbId = $.slbId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IngressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IngressArgs $;

        public Builder() {
            $ = new IngressArgs();
        }

        public Builder(IngressArgs defaults) {
            $ = new IngressArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certId Cert Id.
         * 
         * @return builder
         * 
         */
        public Builder certId(@Nullable Output<String> certId) {
            $.certId = certId;
            return this;
        }

        /**
         * @param certId Cert Id.
         * 
         * @return builder
         * 
         */
        public Builder certId(String certId) {
            return certId(Output.of(certId));
        }

        /**
         * @param defaultRule Default Rule.
         * 
         * @return builder
         * 
         */
        public Builder defaultRule(@Nullable Output<IngressDefaultRuleArgs> defaultRule) {
            $.defaultRule = defaultRule;
            return this;
        }

        /**
         * @param defaultRule Default Rule.
         * 
         * @return builder
         * 
         */
        public Builder defaultRule(IngressDefaultRuleArgs defaultRule) {
            return defaultRule(Output.of(defaultRule));
        }

        /**
         * @param description Description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param listenerPort SLB listening port.
         * 
         * @return builder
         * 
         */
        public Builder listenerPort(Output<Integer> listenerPort) {
            $.listenerPort = listenerPort;
            return this;
        }

        /**
         * @param listenerPort SLB listening port.
         * 
         * @return builder
         * 
         */
        public Builder listenerPort(Integer listenerPort) {
            return listenerPort(Output.of(listenerPort));
        }

        /**
         * @param namespaceId The Id of Namespace.It can contain 2 to 32 lowercase characters.The value is in format `{RegionId}:{namespace}`
         * 
         * @return builder
         * 
         */
        public Builder namespaceId(Output<String> namespaceId) {
            $.namespaceId = namespaceId;
            return this;
        }

        /**
         * @param namespaceId The Id of Namespace.It can contain 2 to 32 lowercase characters.The value is in format `{RegionId}:{namespace}`
         * 
         * @return builder
         * 
         */
        public Builder namespaceId(String namespaceId) {
            return namespaceId(Output.of(namespaceId));
        }

        /**
         * @param rules Forwarding rules. Forward traffic to the specified application according to the domain name and path.
         * 
         * @return builder
         * 
         */
        public Builder rules(Output<List<IngressRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules Forwarding rules. Forward traffic to the specified application according to the domain name and path.
         * 
         * @return builder
         * 
         */
        public Builder rules(List<IngressRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param rules Forwarding rules. Forward traffic to the specified application according to the domain name and path.
         * 
         * @return builder
         * 
         */
        public Builder rules(IngressRuleArgs... rules) {
            return rules(List.of(rules));
        }

        /**
         * @param slbId SLB ID.
         * 
         * @return builder
         * 
         */
        public Builder slbId(Output<String> slbId) {
            $.slbId = slbId;
            return this;
        }

        /**
         * @param slbId SLB ID.
         * 
         * @return builder
         * 
         */
        public Builder slbId(String slbId) {
            return slbId(Output.of(slbId));
        }

        public IngressArgs build() {
            $.listenerPort = Objects.requireNonNull($.listenerPort, "expected parameter 'listenerPort' to be non-null");
            $.namespaceId = Objects.requireNonNull($.namespaceId, "expected parameter 'namespaceId' to be non-null");
            $.rules = Objects.requireNonNull($.rules, "expected parameter 'rules' to be non-null");
            $.slbId = Objects.requireNonNull($.slbId, "expected parameter 'slbId' to be non-null");
            return $;
        }
    }

}