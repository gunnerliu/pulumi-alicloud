// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ram
{
    public static class GetRoles
    {
        /// <summary>
        /// This data source provides a list of RAM Roles in an Alibaba Cloud account according to the specified filters.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var rolesDs = Output.Create(AliCloud.Ram.GetRoles.InvokeAsync(new AliCloud.Ram.GetRolesArgs
        ///         {
        ///             NameRegex = ".*test.*",
        ///             OutputFile = "roles.txt",
        ///             PolicyName = "AliyunACSDefaultAccess",
        ///             PolicyType = "Custom",
        ///         }));
        ///         this.FirstRoleId = rolesDs.Apply(rolesDs =&gt; rolesDs.Roles[0].Id);
        ///     }
        /// 
        ///     [Output("firstRoleId")]
        ///     public Output&lt;string&gt; FirstRoleId { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetRolesResult> InvokeAsync(GetRolesArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetRolesResult>("alicloud:ram/getRoles:getRoles", args ?? new GetRolesArgs(), options.WithVersion());
    }


    public sealed class GetRolesArgs : Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// - A list of ram role IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by the role name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// Filter results by a specific policy name. If you set this parameter without setting `policy_type`, the later will be automatically set to `System`. The resulting roles will be attached to the specified policy.
        /// </summary>
        [Input("policyName")]
        public string? PolicyName { get; set; }

        /// <summary>
        /// Filter results by a specific policy type. Valid values are `Custom` and `System`. If you set this parameter, you must set `policy_name` as well.
        /// </summary>
        [Input("policyType")]
        public string? PolicyType { get; set; }

        public GetRolesArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetRolesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of ram role IDs.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        /// <summary>
        /// A list of ram role names.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly string? PolicyName;
        public readonly string? PolicyType;
        /// <summary>
        /// A list of roles. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRolesRoleResult> Roles;

        [OutputConstructor]
        private GetRolesResult(
            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            string? policyName,

            string? policyType,

            ImmutableArray<Outputs.GetRolesRoleResult> roles)
        {
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            PolicyName = policyName;
            PolicyType = policyType;
            Roles = roles;
        }
    }
}
