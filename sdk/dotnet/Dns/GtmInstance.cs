// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Dns
{
    /// <summary>
    /// Provides a Alidns Gtm Instance resource.
    /// 
    /// For information about Alidns Gtm Instance and how to use it, see [What is Gtm Instance](https://www.alibabacloud.com/help/en/doc-detail/204852.html).
    /// 
    /// &gt; **NOTE:** Available in v1.151.0+.
    /// 
    /// ## Example Usage
    /// 
    /// Basic Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var defaultResourceGroups = AliCloud.ResourceManager.GetResourceGroups.Invoke();
    /// 
    ///     var defaultAlarmContactGroup = new AliCloud.Cms.AlarmContactGroup("defaultAlarmContactGroup", new()
    ///     {
    ///         AlarmContactGroupName = @var.Name,
    ///     });
    /// 
    ///     var defaultGtmInstance = new AliCloud.Dns.GtmInstance("defaultGtmInstance", new()
    ///     {
    ///         InstanceName = @var.Name,
    ///         PaymentType = "Subscription",
    ///         Period = 1,
    ///         RenewalStatus = "ManualRenewal",
    ///         PackageEdition = "standard",
    ///         HealthCheckTaskCount = 100,
    ///         SmsNotificationCount = 1000,
    ///         PublicCnameMode = "SYSTEM_ASSIGN",
    ///         Ttl = 60,
    ///         CnameType = "PUBLIC",
    ///         ResourceGroupId = defaultResourceGroups.Apply(getResourceGroupsResult =&gt; getResourceGroupsResult.Groups[0]?.Id),
    ///         AlertGroups = new[]
    ///         {
    ///             defaultAlarmContactGroup.AlarmContactGroupName,
    ///         },
    ///         PublicUserDomainName = @var.Domain_name,
    ///         AlertConfigs = new[]
    ///         {
    ///             new AliCloud.Dns.Inputs.GtmInstanceAlertConfigArgs
    ///             {
    ///                 SmsNotice = true,
    ///                 NoticeType = "ADDR_ALERT",
    ///                 EmailNotice = true,
    ///                 DingtalkNotice = true,
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Alidns Gtm Instance can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:dns/gtmInstance:GtmInstance example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:dns/gtmInstance:GtmInstance")]
    public partial class GtmInstance : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The alert notification methods. See the following `Block alert_config`.
        /// </summary>
        [Output("alertConfigs")]
        public Output<ImmutableArray<Outputs.GtmInstanceAlertConfig>> AlertConfigs { get; private set; } = null!;

        /// <summary>
        /// The alert group.
        /// </summary>
        [Output("alertGroups")]
        public Output<ImmutableArray<string>> AlertGroups { get; private set; } = null!;

        /// <summary>
        /// The access type of the CNAME domain name. Valid value: `PUBLIC`.
        /// </summary>
        [Output("cnameType")]
        public Output<string> CnameType { get; private set; } = null!;

        /// <summary>
        /// The force update.
        /// </summary>
        [Output("forceUpdate")]
        public Output<bool?> ForceUpdate { get; private set; } = null!;

        /// <summary>
        /// The quota of detection tasks.
        /// </summary>
        [Output("healthCheckTaskCount")]
        public Output<int> HealthCheckTaskCount { get; private set; } = null!;

        /// <summary>
        /// The name of the instance.
        /// </summary>
        [Output("instanceName")]
        public Output<string> InstanceName { get; private set; } = null!;

        /// <summary>
        /// The lang.
        /// </summary>
        [Output("lang")]
        public Output<string?> Lang { get; private set; } = null!;

        /// <summary>
        /// Paid package version. Valid values: `ultimate`, `standard`.
        /// </summary>
        [Output("packageEdition")]
        public Output<string> PackageEdition { get; private set; } = null!;

        /// <summary>
        /// The Payment Type of the resource. Valid value: `Subscription`.
        /// </summary>
        [Output("paymentType")]
        public Output<string> PaymentType { get; private set; } = null!;

        /// <summary>
        /// Creating a pre-paid instance, it must be set, the unit is month, please enter an integer multiple of 12 for annually paid products.
        /// </summary>
        [Output("period")]
        public Output<int> Period { get; private set; } = null!;

        /// <summary>
        /// The Public Network domain name access method. Valid values: `CUSTOM`, `SYSTEM_ASSIGN`.
        /// </summary>
        [Output("publicCnameMode")]
        public Output<string> PublicCnameMode { get; private set; } = null!;

        /// <summary>
        /// The CNAME access domain name.
        /// </summary>
        [Output("publicRr")]
        public Output<string> PublicRr { get; private set; } = null!;

        /// <summary>
        /// The website domain name that the user uses on the Internet.
        /// </summary>
        [Output("publicUserDomainName")]
        public Output<string> PublicUserDomainName { get; private set; } = null!;

        /// <summary>
        /// The domain name that is used to access GTM over the Internet.
        /// </summary>
        [Output("publicZoneName")]
        public Output<string> PublicZoneName { get; private set; } = null!;

        /// <summary>
        /// Automatic renewal period, the unit is month. When setting `renewal_status` to AutoRenewal, it must be set.
        /// </summary>
        [Output("renewPeriod")]
        public Output<int?> RenewPeriod { get; private set; } = null!;

        /// <summary>
        /// Automatic renewal status. Valid values: `AutoRenewal`, `ManualRenewal`.
        /// </summary>
        [Output("renewalStatus")]
        public Output<string> RenewalStatus { get; private set; } = null!;

        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        [Output("resourceGroupId")]
        public Output<string?> ResourceGroupId { get; private set; } = null!;

        /// <summary>
        /// The quota of SMS notifications.
        /// </summary>
        [Output("smsNotificationCount")]
        public Output<int> SmsNotificationCount { get; private set; } = null!;

        /// <summary>
        /// The type of the access policy. Valid values: `GEO`, `LATENCY`.
        /// </summary>
        [Output("strategyMode")]
        public Output<string> StrategyMode { get; private set; } = null!;

        /// <summary>
        /// The global time to live. Valid values: `60`, `120`, `300`, `600`. Unit: second.
        /// </summary>
        [Output("ttl")]
        public Output<int?> Ttl { get; private set; } = null!;


        /// <summary>
        /// Create a GtmInstance resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public GtmInstance(string name, GtmInstanceArgs args, CustomResourceOptions? options = null)
            : base("alicloud:dns/gtmInstance:GtmInstance", name, args ?? new GtmInstanceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private GtmInstance(string name, Input<string> id, GtmInstanceState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:dns/gtmInstance:GtmInstance", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing GtmInstance resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static GtmInstance Get(string name, Input<string> id, GtmInstanceState? state = null, CustomResourceOptions? options = null)
        {
            return new GtmInstance(name, id, state, options);
        }
    }

    public sealed class GtmInstanceArgs : global::Pulumi.ResourceArgs
    {
        [Input("alertConfigs")]
        private InputList<Inputs.GtmInstanceAlertConfigArgs>? _alertConfigs;

        /// <summary>
        /// The alert notification methods. See the following `Block alert_config`.
        /// </summary>
        public InputList<Inputs.GtmInstanceAlertConfigArgs> AlertConfigs
        {
            get => _alertConfigs ?? (_alertConfigs = new InputList<Inputs.GtmInstanceAlertConfigArgs>());
            set => _alertConfigs = value;
        }

        [Input("alertGroups")]
        private InputList<string>? _alertGroups;

        /// <summary>
        /// The alert group.
        /// </summary>
        public InputList<string> AlertGroups
        {
            get => _alertGroups ?? (_alertGroups = new InputList<string>());
            set => _alertGroups = value;
        }

        /// <summary>
        /// The access type of the CNAME domain name. Valid value: `PUBLIC`.
        /// </summary>
        [Input("cnameType")]
        public Input<string>? CnameType { get; set; }

        /// <summary>
        /// The force update.
        /// </summary>
        [Input("forceUpdate")]
        public Input<bool>? ForceUpdate { get; set; }

        /// <summary>
        /// The quota of detection tasks.
        /// </summary>
        [Input("healthCheckTaskCount", required: true)]
        public Input<int> HealthCheckTaskCount { get; set; } = null!;

        /// <summary>
        /// The name of the instance.
        /// </summary>
        [Input("instanceName", required: true)]
        public Input<string> InstanceName { get; set; } = null!;

        /// <summary>
        /// The lang.
        /// </summary>
        [Input("lang")]
        public Input<string>? Lang { get; set; }

        /// <summary>
        /// Paid package version. Valid values: `ultimate`, `standard`.
        /// </summary>
        [Input("packageEdition", required: true)]
        public Input<string> PackageEdition { get; set; } = null!;

        /// <summary>
        /// The Payment Type of the resource. Valid value: `Subscription`.
        /// </summary>
        [Input("paymentType", required: true)]
        public Input<string> PaymentType { get; set; } = null!;

        /// <summary>
        /// Creating a pre-paid instance, it must be set, the unit is month, please enter an integer multiple of 12 for annually paid products.
        /// </summary>
        [Input("period", required: true)]
        public Input<int> Period { get; set; } = null!;

        /// <summary>
        /// The Public Network domain name access method. Valid values: `CUSTOM`, `SYSTEM_ASSIGN`.
        /// </summary>
        [Input("publicCnameMode")]
        public Input<string>? PublicCnameMode { get; set; }

        /// <summary>
        /// The CNAME access domain name.
        /// </summary>
        [Input("publicRr")]
        public Input<string>? PublicRr { get; set; }

        /// <summary>
        /// The website domain name that the user uses on the Internet.
        /// </summary>
        [Input("publicUserDomainName")]
        public Input<string>? PublicUserDomainName { get; set; }

        /// <summary>
        /// The domain name that is used to access GTM over the Internet.
        /// </summary>
        [Input("publicZoneName")]
        public Input<string>? PublicZoneName { get; set; }

        /// <summary>
        /// Automatic renewal period, the unit is month. When setting `renewal_status` to AutoRenewal, it must be set.
        /// </summary>
        [Input("renewPeriod")]
        public Input<int>? RenewPeriod { get; set; }

        /// <summary>
        /// Automatic renewal status. Valid values: `AutoRenewal`, `ManualRenewal`.
        /// </summary>
        [Input("renewalStatus")]
        public Input<string>? RenewalStatus { get; set; }

        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// The quota of SMS notifications.
        /// </summary>
        [Input("smsNotificationCount", required: true)]
        public Input<int> SmsNotificationCount { get; set; } = null!;

        /// <summary>
        /// The type of the access policy. Valid values: `GEO`, `LATENCY`.
        /// </summary>
        [Input("strategyMode")]
        public Input<string>? StrategyMode { get; set; }

        /// <summary>
        /// The global time to live. Valid values: `60`, `120`, `300`, `600`. Unit: second.
        /// </summary>
        [Input("ttl")]
        public Input<int>? Ttl { get; set; }

        public GtmInstanceArgs()
        {
        }
        public static new GtmInstanceArgs Empty => new GtmInstanceArgs();
    }

    public sealed class GtmInstanceState : global::Pulumi.ResourceArgs
    {
        [Input("alertConfigs")]
        private InputList<Inputs.GtmInstanceAlertConfigGetArgs>? _alertConfigs;

        /// <summary>
        /// The alert notification methods. See the following `Block alert_config`.
        /// </summary>
        public InputList<Inputs.GtmInstanceAlertConfigGetArgs> AlertConfigs
        {
            get => _alertConfigs ?? (_alertConfigs = new InputList<Inputs.GtmInstanceAlertConfigGetArgs>());
            set => _alertConfigs = value;
        }

        [Input("alertGroups")]
        private InputList<string>? _alertGroups;

        /// <summary>
        /// The alert group.
        /// </summary>
        public InputList<string> AlertGroups
        {
            get => _alertGroups ?? (_alertGroups = new InputList<string>());
            set => _alertGroups = value;
        }

        /// <summary>
        /// The access type of the CNAME domain name. Valid value: `PUBLIC`.
        /// </summary>
        [Input("cnameType")]
        public Input<string>? CnameType { get; set; }

        /// <summary>
        /// The force update.
        /// </summary>
        [Input("forceUpdate")]
        public Input<bool>? ForceUpdate { get; set; }

        /// <summary>
        /// The quota of detection tasks.
        /// </summary>
        [Input("healthCheckTaskCount")]
        public Input<int>? HealthCheckTaskCount { get; set; }

        /// <summary>
        /// The name of the instance.
        /// </summary>
        [Input("instanceName")]
        public Input<string>? InstanceName { get; set; }

        /// <summary>
        /// The lang.
        /// </summary>
        [Input("lang")]
        public Input<string>? Lang { get; set; }

        /// <summary>
        /// Paid package version. Valid values: `ultimate`, `standard`.
        /// </summary>
        [Input("packageEdition")]
        public Input<string>? PackageEdition { get; set; }

        /// <summary>
        /// The Payment Type of the resource. Valid value: `Subscription`.
        /// </summary>
        [Input("paymentType")]
        public Input<string>? PaymentType { get; set; }

        /// <summary>
        /// Creating a pre-paid instance, it must be set, the unit is month, please enter an integer multiple of 12 for annually paid products.
        /// </summary>
        [Input("period")]
        public Input<int>? Period { get; set; }

        /// <summary>
        /// The Public Network domain name access method. Valid values: `CUSTOM`, `SYSTEM_ASSIGN`.
        /// </summary>
        [Input("publicCnameMode")]
        public Input<string>? PublicCnameMode { get; set; }

        /// <summary>
        /// The CNAME access domain name.
        /// </summary>
        [Input("publicRr")]
        public Input<string>? PublicRr { get; set; }

        /// <summary>
        /// The website domain name that the user uses on the Internet.
        /// </summary>
        [Input("publicUserDomainName")]
        public Input<string>? PublicUserDomainName { get; set; }

        /// <summary>
        /// The domain name that is used to access GTM over the Internet.
        /// </summary>
        [Input("publicZoneName")]
        public Input<string>? PublicZoneName { get; set; }

        /// <summary>
        /// Automatic renewal period, the unit is month. When setting `renewal_status` to AutoRenewal, it must be set.
        /// </summary>
        [Input("renewPeriod")]
        public Input<int>? RenewPeriod { get; set; }

        /// <summary>
        /// Automatic renewal status. Valid values: `AutoRenewal`, `ManualRenewal`.
        /// </summary>
        [Input("renewalStatus")]
        public Input<string>? RenewalStatus { get; set; }

        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// The quota of SMS notifications.
        /// </summary>
        [Input("smsNotificationCount")]
        public Input<int>? SmsNotificationCount { get; set; }

        /// <summary>
        /// The type of the access policy. Valid values: `GEO`, `LATENCY`.
        /// </summary>
        [Input("strategyMode")]
        public Input<string>? StrategyMode { get; set; }

        /// <summary>
        /// The global time to live. Valid values: `60`, `120`, `300`, `600`. Unit: second.
        /// </summary>
        [Input("ttl")]
        public Input<int>? Ttl { get; set; }

        public GtmInstanceState()
        {
        }
        public static new GtmInstanceState Empty => new GtmInstanceState();
    }
}
