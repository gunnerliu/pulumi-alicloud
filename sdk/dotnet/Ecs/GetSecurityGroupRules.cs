// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ecs
{
    public static class GetSecurityGroupRules
    {
        /// <summary>
        /// The `alicloud.ecs.getSecurityGroupRules` data source provides a collection of security permissions of a specific security group.
        /// Each collection item represents a single `ingress` or `egress` permission rule.
        /// The ID of the security group can be provided via a variable or the result from the other data source `alicloud.ecs.getSecurityGroups`.
        /// </summary>
        public static Task<GetSecurityGroupRulesResult> InvokeAsync(GetSecurityGroupRulesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSecurityGroupRulesResult>("alicloud:ecs/getSecurityGroupRules:getSecurityGroupRules", args ?? new GetSecurityGroupRulesArgs(), options.WithDefaults());

        /// <summary>
        /// The `alicloud.ecs.getSecurityGroupRules` data source provides a collection of security permissions of a specific security group.
        /// Each collection item represents a single `ingress` or `egress` permission rule.
        /// The ID of the security group can be provided via a variable or the result from the other data source `alicloud.ecs.getSecurityGroups`.
        /// </summary>
        public static Output<GetSecurityGroupRulesResult> Invoke(GetSecurityGroupRulesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSecurityGroupRulesResult>("alicloud:ecs/getSecurityGroupRules:getSecurityGroupRules", args ?? new GetSecurityGroupRulesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSecurityGroupRulesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Authorization direction. Valid values are: `ingress` or `egress`.
        /// </summary>
        [Input("direction")]
        public string? Direction { get; set; }

        /// <summary>
        /// The ID of the security group that owns the rules.
        /// </summary>
        [Input("groupId", required: true)]
        public string GroupId { get; set; } = null!;

        /// <summary>
        /// The IP protocol. Valid values are: `tcp`, `udp`, `icmp`, `gre` and `all`.
        /// </summary>
        [Input("ipProtocol")]
        public string? IpProtocol { get; set; }

        /// <summary>
        /// Refers to the network type. Can be either `internet` or `intranet`. The default value is `internet`.
        /// </summary>
        [Input("nicType")]
        public string? NicType { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// Authorization policy. Can be either `accept` or `drop`. The default value is `accept`.
        /// </summary>
        [Input("policy")]
        public string? Policy { get; set; }

        public GetSecurityGroupRulesArgs()
        {
        }
        public static new GetSecurityGroupRulesArgs Empty => new GetSecurityGroupRulesArgs();
    }

    public sealed class GetSecurityGroupRulesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Authorization direction. Valid values are: `ingress` or `egress`.
        /// </summary>
        [Input("direction")]
        public Input<string>? Direction { get; set; }

        /// <summary>
        /// The ID of the security group that owns the rules.
        /// </summary>
        [Input("groupId", required: true)]
        public Input<string> GroupId { get; set; } = null!;

        /// <summary>
        /// The IP protocol. Valid values are: `tcp`, `udp`, `icmp`, `gre` and `all`.
        /// </summary>
        [Input("ipProtocol")]
        public Input<string>? IpProtocol { get; set; }

        /// <summary>
        /// Refers to the network type. Can be either `internet` or `intranet`. The default value is `internet`.
        /// </summary>
        [Input("nicType")]
        public Input<string>? NicType { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// Authorization policy. Can be either `accept` or `drop`. The default value is `accept`.
        /// </summary>
        [Input("policy")]
        public Input<string>? Policy { get; set; }

        public GetSecurityGroupRulesInvokeArgs()
        {
        }
        public static new GetSecurityGroupRulesInvokeArgs Empty => new GetSecurityGroupRulesInvokeArgs();
    }


    [OutputType]
    public sealed class GetSecurityGroupRulesResult
    {
        /// <summary>
        /// Authorization direction, `ingress` or `egress`.
        /// </summary>
        public readonly string? Direction;
        /// <summary>
        /// The description of the security group that owns the rules.
        /// </summary>
        public readonly string GroupDesc;
        public readonly string GroupId;
        /// <summary>
        /// The name of the security group that owns the rules.
        /// </summary>
        public readonly string GroupName;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The protocol. Can be `tcp`, `udp`, `icmp`, `gre` or `all`.
        /// </summary>
        public readonly string? IpProtocol;
        /// <summary>
        /// Network type, `internet` or `intranet`.
        /// </summary>
        public readonly string? NicType;
        public readonly string? OutputFile;
        /// <summary>
        /// Authorization policy. Can be either `accept` or `drop`.
        /// </summary>
        public readonly string? Policy;
        /// <summary>
        /// A list of security group rules. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSecurityGroupRulesRuleResult> Rules;

        [OutputConstructor]
        private GetSecurityGroupRulesResult(
            string? direction,

            string groupDesc,

            string groupId,

            string groupName,

            string id,

            string? ipProtocol,

            string? nicType,

            string? outputFile,

            string? policy,

            ImmutableArray<Outputs.GetSecurityGroupRulesRuleResult> rules)
        {
            Direction = direction;
            GroupDesc = groupDesc;
            GroupId = groupId;
            GroupName = groupName;
            Id = id;
            IpProtocol = ipProtocol;
            NicType = nicType;
            OutputFile = outputFile;
            Policy = policy;
            Rules = rules;
        }
    }
}
