// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecp;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceArgs Empty = new InstanceArgs();

    /**
     * The auto pay.
     * 
     */
    @Import(name="autoPay")
    private @Nullable Output<Boolean> autoPay;

    /**
     * @return The auto pay.
     * 
     */
    public Optional<Output<Boolean>> autoPay() {
        return Optional.ofNullable(this.autoPay);
    }

    /**
     * The auto renew.
     * 
     */
    @Import(name="autoRenew")
    private @Nullable Output<Boolean> autoRenew;

    /**
     * @return The auto renew.
     * 
     */
    public Optional<Output<Boolean>> autoRenew() {
        return Optional.ofNullable(this.autoRenew);
    }

    /**
     * Description of the instance. 2 to 256 English or Chinese characters in length and cannot
     * start with `http://` and `https`.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the instance. 2 to 256 English or Chinese characters in length and cannot
     * start with `http://` and `https`.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The eip bandwidth.
     * 
     */
    @Import(name="eipBandwidth")
    private @Nullable Output<Integer> eipBandwidth;

    /**
     * @return The eip bandwidth.
     * 
     */
    public Optional<Output<Integer>> eipBandwidth() {
        return Optional.ofNullable(this.eipBandwidth);
    }

    /**
     * The force.
     * 
     */
    @Import(name="force")
    private @Nullable Output<Boolean> force;

    /**
     * @return The force.
     * 
     */
    public Optional<Output<Boolean>> force() {
        return Optional.ofNullable(this.force);
    }

    /**
     * The ID Of The Image.
     * 
     */
    @Import(name="imageId", required=true)
    private Output<String> imageId;

    /**
     * @return The ID Of The Image.
     * 
     */
    public Output<String> imageId() {
        return this.imageId;
    }

    /**
     * The name of the instance. It must be 2 to 128 characters in length and must start with an
     * uppercase letter or Chinese. It cannot start with http:// or https. It can contain Chinese, English, numbers,
     * half-width colons (:), underscores (_), half-width periods (.), or dashes (-). The default value is the InstanceId of
     * the instance.
     * 
     */
    @Import(name="instanceName")
    private @Nullable Output<String> instanceName;

    /**
     * @return The name of the instance. It must be 2 to 128 characters in length and must start with an
     * uppercase letter or Chinese. It cannot start with http:// or https. It can contain Chinese, English, numbers,
     * half-width colons (:), underscores (_), half-width periods (.), or dashes (-). The default value is the InstanceId of
     * the instance.
     * 
     */
    public Optional<Output<String>> instanceName() {
        return Optional.ofNullable(this.instanceName);
    }

    /**
     * Instance Type.
     * 
     */
    @Import(name="instanceType", required=true)
    private Output<String> instanceType;

    /**
     * @return Instance Type.
     * 
     */
    public Output<String> instanceType() {
        return this.instanceType;
    }

    /**
     * The name of the key pair of the mobile phone instance.
     * 
     */
    @Import(name="keyPairName")
    private @Nullable Output<String> keyPairName;

    /**
     * @return The name of the key pair of the mobile phone instance.
     * 
     */
    public Optional<Output<String>> keyPairName() {
        return Optional.ofNullable(this.keyPairName);
    }

    /**
     * The payment type.Valid values: `PayAsYouGo`,`Subscription`
     * 
     */
    @Import(name="paymentType")
    private @Nullable Output<String> paymentType;

    /**
     * @return The payment type.Valid values: `PayAsYouGo`,`Subscription`
     * 
     */
    public Optional<Output<String>> paymentType() {
        return Optional.ofNullable(this.paymentType);
    }

    /**
     * The period. It is valid when `period_unit` is &#39;Year&#39;. Valid value: `1`, `2`, `3`, `4`, `5`. It
     * is valid when `period_unit` is &#39;Month&#39;. Valid value: `1`, `2`, `3`, `5`
     * 
     */
    @Import(name="period")
    private @Nullable Output<String> period;

    /**
     * @return The period. It is valid when `period_unit` is &#39;Year&#39;. Valid value: `1`, `2`, `3`, `4`, `5`. It
     * is valid when `period_unit` is &#39;Month&#39;. Valid value: `1`, `2`, `3`, `5`
     * 
     */
    public Optional<Output<String>> period() {
        return Optional.ofNullable(this.period);
    }

    /**
     * The duration unit that you will buy the resource. Valid value: `Year`,`Month`. Default
     * to `Month`.
     * 
     */
    @Import(name="periodUnit")
    private @Nullable Output<String> periodUnit;

    /**
     * @return The duration unit that you will buy the resource. Valid value: `Year`,`Month`. Default
     * to `Month`.
     * 
     */
    public Optional<Output<String>> periodUnit() {
        return Optional.ofNullable(this.periodUnit);
    }

    /**
     * The selected resolution for the cloud mobile phone instance.
     * 
     */
    @Import(name="resolution")
    private @Nullable Output<String> resolution;

    /**
     * @return The selected resolution for the cloud mobile phone instance.
     * 
     */
    public Optional<Output<String>> resolution() {
        return Optional.ofNullable(this.resolution);
    }

    /**
     * The ID of the security group. The security group is the same as that of the
     * ECS instance.
     * 
     */
    @Import(name="securityGroupId", required=true)
    private Output<String> securityGroupId;

    /**
     * @return The ID of the security group. The security group is the same as that of the
     * ECS instance.
     * 
     */
    public Output<String> securityGroupId() {
        return this.securityGroupId;
    }

    /**
     * Instance status. Valid values: `Running`, `Stopped`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Instance status. Valid values: `Running`, `Stopped`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * Cloud mobile phone VNC password. The password must be six characters in length and must
     * contain only uppercase, lowercase English letters and Arabic numerals.
     * 
     */
    @Import(name="vncPassword")
    private @Nullable Output<String> vncPassword;

    /**
     * @return Cloud mobile phone VNC password. The password must be six characters in length and must
     * contain only uppercase, lowercase English letters and Arabic numerals.
     * 
     */
    public Optional<Output<String>> vncPassword() {
        return Optional.ofNullable(this.vncPassword);
    }

    /**
     * The vswitch id.
     * 
     */
    @Import(name="vswitchId", required=true)
    private Output<String> vswitchId;

    /**
     * @return The vswitch id.
     * 
     */
    public Output<String> vswitchId() {
        return this.vswitchId;
    }

    private InstanceArgs() {}

    private InstanceArgs(InstanceArgs $) {
        this.autoPay = $.autoPay;
        this.autoRenew = $.autoRenew;
        this.description = $.description;
        this.eipBandwidth = $.eipBandwidth;
        this.force = $.force;
        this.imageId = $.imageId;
        this.instanceName = $.instanceName;
        this.instanceType = $.instanceType;
        this.keyPairName = $.keyPairName;
        this.paymentType = $.paymentType;
        this.period = $.period;
        this.periodUnit = $.periodUnit;
        this.resolution = $.resolution;
        this.securityGroupId = $.securityGroupId;
        this.status = $.status;
        this.vncPassword = $.vncPassword;
        this.vswitchId = $.vswitchId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceArgs $;

        public Builder() {
            $ = new InstanceArgs();
        }

        public Builder(InstanceArgs defaults) {
            $ = new InstanceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoPay The auto pay.
         * 
         * @return builder
         * 
         */
        public Builder autoPay(@Nullable Output<Boolean> autoPay) {
            $.autoPay = autoPay;
            return this;
        }

        /**
         * @param autoPay The auto pay.
         * 
         * @return builder
         * 
         */
        public Builder autoPay(Boolean autoPay) {
            return autoPay(Output.of(autoPay));
        }

        /**
         * @param autoRenew The auto renew.
         * 
         * @return builder
         * 
         */
        public Builder autoRenew(@Nullable Output<Boolean> autoRenew) {
            $.autoRenew = autoRenew;
            return this;
        }

        /**
         * @param autoRenew The auto renew.
         * 
         * @return builder
         * 
         */
        public Builder autoRenew(Boolean autoRenew) {
            return autoRenew(Output.of(autoRenew));
        }

        /**
         * @param description Description of the instance. 2 to 256 English or Chinese characters in length and cannot
         * start with `http://` and `https`.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the instance. 2 to 256 English or Chinese characters in length and cannot
         * start with `http://` and `https`.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param eipBandwidth The eip bandwidth.
         * 
         * @return builder
         * 
         */
        public Builder eipBandwidth(@Nullable Output<Integer> eipBandwidth) {
            $.eipBandwidth = eipBandwidth;
            return this;
        }

        /**
         * @param eipBandwidth The eip bandwidth.
         * 
         * @return builder
         * 
         */
        public Builder eipBandwidth(Integer eipBandwidth) {
            return eipBandwidth(Output.of(eipBandwidth));
        }

        /**
         * @param force The force.
         * 
         * @return builder
         * 
         */
        public Builder force(@Nullable Output<Boolean> force) {
            $.force = force;
            return this;
        }

        /**
         * @param force The force.
         * 
         * @return builder
         * 
         */
        public Builder force(Boolean force) {
            return force(Output.of(force));
        }

        /**
         * @param imageId The ID Of The Image.
         * 
         * @return builder
         * 
         */
        public Builder imageId(Output<String> imageId) {
            $.imageId = imageId;
            return this;
        }

        /**
         * @param imageId The ID Of The Image.
         * 
         * @return builder
         * 
         */
        public Builder imageId(String imageId) {
            return imageId(Output.of(imageId));
        }

        /**
         * @param instanceName The name of the instance. It must be 2 to 128 characters in length and must start with an
         * uppercase letter or Chinese. It cannot start with http:// or https. It can contain Chinese, English, numbers,
         * half-width colons (:), underscores (_), half-width periods (.), or dashes (-). The default value is the InstanceId of
         * the instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceName(@Nullable Output<String> instanceName) {
            $.instanceName = instanceName;
            return this;
        }

        /**
         * @param instanceName The name of the instance. It must be 2 to 128 characters in length and must start with an
         * uppercase letter or Chinese. It cannot start with http:// or https. It can contain Chinese, English, numbers,
         * half-width colons (:), underscores (_), half-width periods (.), or dashes (-). The default value is the InstanceId of
         * the instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceName(String instanceName) {
            return instanceName(Output.of(instanceName));
        }

        /**
         * @param instanceType Instance Type.
         * 
         * @return builder
         * 
         */
        public Builder instanceType(Output<String> instanceType) {
            $.instanceType = instanceType;
            return this;
        }

        /**
         * @param instanceType Instance Type.
         * 
         * @return builder
         * 
         */
        public Builder instanceType(String instanceType) {
            return instanceType(Output.of(instanceType));
        }

        /**
         * @param keyPairName The name of the key pair of the mobile phone instance.
         * 
         * @return builder
         * 
         */
        public Builder keyPairName(@Nullable Output<String> keyPairName) {
            $.keyPairName = keyPairName;
            return this;
        }

        /**
         * @param keyPairName The name of the key pair of the mobile phone instance.
         * 
         * @return builder
         * 
         */
        public Builder keyPairName(String keyPairName) {
            return keyPairName(Output.of(keyPairName));
        }

        /**
         * @param paymentType The payment type.Valid values: `PayAsYouGo`,`Subscription`
         * 
         * @return builder
         * 
         */
        public Builder paymentType(@Nullable Output<String> paymentType) {
            $.paymentType = paymentType;
            return this;
        }

        /**
         * @param paymentType The payment type.Valid values: `PayAsYouGo`,`Subscription`
         * 
         * @return builder
         * 
         */
        public Builder paymentType(String paymentType) {
            return paymentType(Output.of(paymentType));
        }

        /**
         * @param period The period. It is valid when `period_unit` is &#39;Year&#39;. Valid value: `1`, `2`, `3`, `4`, `5`. It
         * is valid when `period_unit` is &#39;Month&#39;. Valid value: `1`, `2`, `3`, `5`
         * 
         * @return builder
         * 
         */
        public Builder period(@Nullable Output<String> period) {
            $.period = period;
            return this;
        }

        /**
         * @param period The period. It is valid when `period_unit` is &#39;Year&#39;. Valid value: `1`, `2`, `3`, `4`, `5`. It
         * is valid when `period_unit` is &#39;Month&#39;. Valid value: `1`, `2`, `3`, `5`
         * 
         * @return builder
         * 
         */
        public Builder period(String period) {
            return period(Output.of(period));
        }

        /**
         * @param periodUnit The duration unit that you will buy the resource. Valid value: `Year`,`Month`. Default
         * to `Month`.
         * 
         * @return builder
         * 
         */
        public Builder periodUnit(@Nullable Output<String> periodUnit) {
            $.periodUnit = periodUnit;
            return this;
        }

        /**
         * @param periodUnit The duration unit that you will buy the resource. Valid value: `Year`,`Month`. Default
         * to `Month`.
         * 
         * @return builder
         * 
         */
        public Builder periodUnit(String periodUnit) {
            return periodUnit(Output.of(periodUnit));
        }

        /**
         * @param resolution The selected resolution for the cloud mobile phone instance.
         * 
         * @return builder
         * 
         */
        public Builder resolution(@Nullable Output<String> resolution) {
            $.resolution = resolution;
            return this;
        }

        /**
         * @param resolution The selected resolution for the cloud mobile phone instance.
         * 
         * @return builder
         * 
         */
        public Builder resolution(String resolution) {
            return resolution(Output.of(resolution));
        }

        /**
         * @param securityGroupId The ID of the security group. The security group is the same as that of the
         * ECS instance.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupId(Output<String> securityGroupId) {
            $.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * @param securityGroupId The ID of the security group. The security group is the same as that of the
         * ECS instance.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupId(String securityGroupId) {
            return securityGroupId(Output.of(securityGroupId));
        }

        /**
         * @param status Instance status. Valid values: `Running`, `Stopped`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Instance status. Valid values: `Running`, `Stopped`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param vncPassword Cloud mobile phone VNC password. The password must be six characters in length and must
         * contain only uppercase, lowercase English letters and Arabic numerals.
         * 
         * @return builder
         * 
         */
        public Builder vncPassword(@Nullable Output<String> vncPassword) {
            $.vncPassword = vncPassword;
            return this;
        }

        /**
         * @param vncPassword Cloud mobile phone VNC password. The password must be six characters in length and must
         * contain only uppercase, lowercase English letters and Arabic numerals.
         * 
         * @return builder
         * 
         */
        public Builder vncPassword(String vncPassword) {
            return vncPassword(Output.of(vncPassword));
        }

        /**
         * @param vswitchId The vswitch id.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(Output<String> vswitchId) {
            $.vswitchId = vswitchId;
            return this;
        }

        /**
         * @param vswitchId The vswitch id.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(String vswitchId) {
            return vswitchId(Output.of(vswitchId));
        }

        public InstanceArgs build() {
            $.imageId = Objects.requireNonNull($.imageId, "expected parameter 'imageId' to be non-null");
            $.instanceType = Objects.requireNonNull($.instanceType, "expected parameter 'instanceType' to be non-null");
            $.securityGroupId = Objects.requireNonNull($.securityGroupId, "expected parameter 'securityGroupId' to be non-null");
            $.vswitchId = Objects.requireNonNull($.vswitchId, "expected parameter 'vswitchId' to be non-null");
            return $;
        }
    }

}
