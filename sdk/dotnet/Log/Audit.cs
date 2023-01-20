// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Log
{
    /// <summary>
    /// SLS log audit exists in the form of log service app.
    /// 
    /// In addition to inheriting all SLS functions, it also enhances the real-time automatic centralized collection of audit related logs across multi cloud products under multi accounts, and provides support for storage, query and information summary required by audit. It covers actiontrail, OSS, NAS, SLB, API gateway, RDS, WAF, cloud firewall, cloud security center and other products.
    /// 
    /// &gt; **NOTE:** Available in 1.81.0
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
    ///     var example = new AliCloud.Log.Audit("example", new()
    ///     {
    ///         Aliuid = "12345678",
    ///         DisplayName = "tf-audit-test",
    ///         VariableMap = 
    ///         {
    ///             { "actiontrail_enabled", "true" },
    ///             { "actiontrail_ti_enabled", "false" },
    ///             { "actiontrail_ttl", "180" },
    ///             { "apigateway_enabled", "true" },
    ///             { "apigateway_ti_enabled", "false" },
    ///             { "apigateway_ttl", "180" },
    ///             { "appconnect_enabled", "false" },
    ///             { "appconnect_ttl", "180" },
    ///             { "bastion_enabled", "true" },
    ///             { "bastion_ti_enabled", "false" },
    ///             { "bastion_ttl", "180" },
    ///             { "cloudfirewall_enabled", "true" },
    ///             { "cloudfirewall_ti_enabled", "false" },
    ///             { "cloudfirewall_ttl", "180" },
    ///             { "cps_enabled", "true" },
    ///             { "cps_ti_enabled", "false" },
    ///             { "cps_ttl", "180" },
    ///             { "ddos_bgp_access_enabled", "false" },
    ///             { "ddos_bgp_access_ttl", "180" },
    ///             { "ddos_coo_access_enabled", "false" },
    ///             { "ddos_coo_access_ti_enabled", "false" },
    ///             { "ddos_coo_access_ttl", "180" },
    ///             { "ddos_dip_access_enabled", "false" },
    ///             { "ddos_dip_access_ti_enabled", "false" },
    ///             { "ddos_dip_access_ttl", "180" },
    ///             { "drds_audit_collection_policy", "" },
    ///             { "drds_audit_enabled", "true" },
    ///             { "drds_audit_ti_enabled", "false" },
    ///             { "drds_audit_ttl", "7" },
    ///             { "drds_sync_enabled", "true" },
    ///             { "drds_sync_ttl", "180" },
    ///             { "k8s_audit_collection_policy", "" },
    ///             { "k8s_audit_enabled", "true" },
    ///             { "k8s_audit_ttl", "180" },
    ///             { "k8s_event_collection_policy", "" },
    ///             { "k8s_event_enabled", "true" },
    ///             { "k8s_event_ttl", "180" },
    ///             { "k8s_ingress_collection_policy", "" },
    ///             { "k8s_ingress_enabled", "true" },
    ///             { "k8s_ingress_ttl", "180" },
    ///             { "nas_enabled", "true" },
    ///             { "nas_ti_enabled", "false" },
    ///             { "nas_ttl", "180" },
    ///             { "oss_access_enabled", "true" },
    ///             { "oss_access_ti_enabled", "false" },
    ///             { "oss_access_ttl", "7" },
    ///             { "oss_metering_enabled", "true" },
    ///             { "oss_metering_ttl", "180" },
    ///             { "oss_sync_enabled", "true" },
    ///             { "oss_sync_ttl", "180" },
    ///             { "polardb_audit_collection_policy", "" },
    ///             { "polardb_enabled", "true" },
    ///             { "polardb_perf_collection_policy", "" },
    ///             { "polardb_perf_enabled", "false" },
    ///             { "polardb_perf_ttl", "180" },
    ///             { "polardb_slow_collection_policy", "" },
    ///             { "polardb_slow_enabled", "false" },
    ///             { "polardb_slow_ttl", "180" },
    ///             { "polardb_ti_enabled", "false" },
    ///             { "polardb_ttl", "180" },
    ///             { "rds_audit_collection_policy", "" },
    ///             { "rds_enabled", "true" },
    ///             { "rds_perf_collection_policy", "" },
    ///             { "rds_perf_enabled", "false" },
    ///             { "rds_perf_ttl", "180" },
    ///             { "rds_slow_collection_policy", "" },
    ///             { "rds_slow_enabled", "false" },
    ///             { "rds_slow_ttl", "180" },
    ///             { "rds_ti_enabled", "false" },
    ///             { "rds_ttl", "180" },
    ///             { "sas_crack_enabled", "true" },
    ///             { "sas_dns_enabled", "true" },
    ///             { "sas_http_enabled", "true" },
    ///             { "sas_local_dns_enabled", "true" },
    ///             { "sas_login_enabled", "true" },
    ///             { "sas_network_enabled", "true" },
    ///             { "sas_process_enabled", "true" },
    ///             { "sas_security_alert_enabled", "true" },
    ///             { "sas_security_hc_enabled", "true" },
    ///             { "sas_security_vul_enabled", "true" },
    ///             { "sas_session_enabled", "true" },
    ///             { "sas_snapshot_account_enabled", "true" },
    ///             { "sas_snapshot_port_enabled", "true" },
    ///             { "sas_snapshot_process_enabled", "true" },
    ///             { "sas_ti_enabled", "false" },
    ///             { "sas_ttl", "180" },
    ///             { "slb_access_collection_policy", "" },
    ///             { "slb_access_enabled", "true" },
    ///             { "slb_access_ti_enabled", "false" },
    ///             { "slb_access_ttl", "7" },
    ///             { "slb_sync_enabled", "true" },
    ///             { "slb_sync_ttl", "180" },
    ///             { "vpc_flow_collection_policy", "" },
    ///             { "vpc_flow_enabled", "false" },
    ///             { "vpc_flow_ttl", "7" },
    ///             { "vpc_sync_enabled", "true" },
    ///             { "vpc_sync_ttl", "180" },
    ///             { "waf_enabled", "true" },
    ///             { "waf_ti_enabled", "false" },
    ///             { "waf_ttl", "180" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// Multiple accounts Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new AliCloud.Log.Audit("example", new()
    ///     {
    ///         Aliuid = "12345678",
    ///         DisplayName = "tf-audit-test",
    ///         MultiAccounts = new[]
    ///         {
    ///             "123456789123",
    ///             "12345678912300123",
    ///         },
    ///         VariableMap = 
    ///         {
    ///             { "actiontrail_enabled", "true" },
    ///             { "actiontrail_ttl", "180" },
    ///             { "oss_access_enabled", "true" },
    ///             { "oss_access_ttl", "180" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// Resource Directory Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new AliCloud.Log.Audit("example", new()
    ///     {
    ///         Aliuid = "12345678",
    ///         DisplayName = "tf-audit-test",
    ///         ResourceDirectoryType = "all",
    ///         VariableMap = 
    ///         {
    ///             { "actiontrail_enabled", "true" },
    ///             { "actiontrail_ttl", "180" },
    ///             { "oss_access_enabled", "true" },
    ///             { "oss_access_ttl", "180" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new AliCloud.Log.Audit("example", new()
    ///     {
    ///         Aliuid = "12345678",
    ///         DisplayName = "tf-audit-test",
    ///         MultiAccounts = new[]
    ///         {
    ///             "123456789123",
    ///             "12345678912300123",
    ///         },
    ///         ResourceDirectoryType = "custom",
    ///         VariableMap = 
    ///         {
    ///             { "actiontrail_enabled", "true" },
    ///             { "actiontrail_ttl", "180" },
    ///             { "oss_access_enabled", "true" },
    ///             { "oss_access_ttl", "180" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Log audit can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:log/audit:Audit example tf-audit-test
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:log/audit:Audit")]
    public partial class Audit : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Aliuid value of your account.
        /// </summary>
        [Output("aliuid")]
        public Output<string> Aliuid { get; private set; } = null!;

        /// <summary>
        /// Name of SLS log audit.
        /// </summary>
        [Output("displayName")]
        public Output<string> DisplayName { get; private set; } = null!;

        /// <summary>
        /// Multi-account configuration, please fill in multiple aliuid.
        /// </summary>
        [Output("multiAccounts")]
        public Output<ImmutableArray<string>> MultiAccounts { get; private set; } = null!;

        /// <summary>
        /// Resource Directory type. Optional values are all or custom. If the value is custom, argument multi_account should be provided.
        /// </summary>
        [Output("resourceDirectoryType")]
        public Output<string?> ResourceDirectoryType { get; private set; } = null!;

        /// <summary>
        /// Log audit detailed configuration.
        /// </summary>
        [Output("variableMap")]
        public Output<ImmutableDictionary<string, object>?> VariableMap { get; private set; } = null!;


        /// <summary>
        /// Create a Audit resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Audit(string name, AuditArgs args, CustomResourceOptions? options = null)
            : base("alicloud:log/audit:Audit", name, args ?? new AuditArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Audit(string name, Input<string> id, AuditState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:log/audit:Audit", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Audit resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Audit Get(string name, Input<string> id, AuditState? state = null, CustomResourceOptions? options = null)
        {
            return new Audit(name, id, state, options);
        }
    }

    public sealed class AuditArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Aliuid value of your account.
        /// </summary>
        [Input("aliuid", required: true)]
        public Input<string> Aliuid { get; set; } = null!;

        /// <summary>
        /// Name of SLS log audit.
        /// </summary>
        [Input("displayName", required: true)]
        public Input<string> DisplayName { get; set; } = null!;

        [Input("multiAccounts")]
        private InputList<string>? _multiAccounts;

        /// <summary>
        /// Multi-account configuration, please fill in multiple aliuid.
        /// </summary>
        public InputList<string> MultiAccounts
        {
            get => _multiAccounts ?? (_multiAccounts = new InputList<string>());
            set => _multiAccounts = value;
        }

        /// <summary>
        /// Resource Directory type. Optional values are all or custom. If the value is custom, argument multi_account should be provided.
        /// </summary>
        [Input("resourceDirectoryType")]
        public Input<string>? ResourceDirectoryType { get; set; }

        [Input("variableMap")]
        private InputMap<object>? _variableMap;

        /// <summary>
        /// Log audit detailed configuration.
        /// </summary>
        public InputMap<object> VariableMap
        {
            get => _variableMap ?? (_variableMap = new InputMap<object>());
            set => _variableMap = value;
        }

        public AuditArgs()
        {
        }
        public static new AuditArgs Empty => new AuditArgs();
    }

    public sealed class AuditState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Aliuid value of your account.
        /// </summary>
        [Input("aliuid")]
        public Input<string>? Aliuid { get; set; }

        /// <summary>
        /// Name of SLS log audit.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        [Input("multiAccounts")]
        private InputList<string>? _multiAccounts;

        /// <summary>
        /// Multi-account configuration, please fill in multiple aliuid.
        /// </summary>
        public InputList<string> MultiAccounts
        {
            get => _multiAccounts ?? (_multiAccounts = new InputList<string>());
            set => _multiAccounts = value;
        }

        /// <summary>
        /// Resource Directory type. Optional values are all or custom. If the value is custom, argument multi_account should be provided.
        /// </summary>
        [Input("resourceDirectoryType")]
        public Input<string>? ResourceDirectoryType { get; set; }

        [Input("variableMap")]
        private InputMap<object>? _variableMap;

        /// <summary>
        /// Log audit detailed configuration.
        /// </summary>
        public InputMap<object> VariableMap
        {
            get => _variableMap ?? (_variableMap = new InputMap<object>());
            set => _variableMap = value;
        }

        public AuditState()
        {
        }
        public static new AuditState Empty => new AuditState();
    }
}
