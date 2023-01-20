// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Brain
{
    public static class GetIndustrialPidOrganizations
    {
        /// <summary>
        /// This data source provides the Brain Industrial Pid Organizations of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.113.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
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
        ///     var example = AliCloud.Brain.GetIndustrialPidOrganizations.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "3e74e684-cbb5-xxxx",
        ///         },
        ///         NameRegex = "tf-testAcc",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstBrainIndustrialPidOrganizationId"] = example.Apply(getIndustrialPidOrganizationsResult =&gt; getIndustrialPidOrganizationsResult.Organizations[0]?.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetIndustrialPidOrganizationsResult> InvokeAsync(GetIndustrialPidOrganizationsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetIndustrialPidOrganizationsResult>("alicloud:brain/getIndustrialPidOrganizations:getIndustrialPidOrganizations", args ?? new GetIndustrialPidOrganizationsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Brain Industrial Pid Organizations of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.113.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
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
        ///     var example = AliCloud.Brain.GetIndustrialPidOrganizations.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "3e74e684-cbb5-xxxx",
        ///         },
        ///         NameRegex = "tf-testAcc",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstBrainIndustrialPidOrganizationId"] = example.Apply(getIndustrialPidOrganizationsResult =&gt; getIndustrialPidOrganizationsResult.Organizations[0]?.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetIndustrialPidOrganizationsResult> Invoke(GetIndustrialPidOrganizationsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetIndustrialPidOrganizationsResult>("alicloud:brain/getIndustrialPidOrganizations:getIndustrialPidOrganizations", args ?? new GetIndustrialPidOrganizationsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetIndustrialPidOrganizationsArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Pid Organization IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Pid Organization name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The parent organization id.
        /// </summary>
        [Input("parentOrganizationId")]
        public string? ParentOrganizationId { get; set; }

        public GetIndustrialPidOrganizationsArgs()
        {
        }
        public static new GetIndustrialPidOrganizationsArgs Empty => new GetIndustrialPidOrganizationsArgs();
    }

    public sealed class GetIndustrialPidOrganizationsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Pid Organization IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Pid Organization name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The parent organization id.
        /// </summary>
        [Input("parentOrganizationId")]
        public Input<string>? ParentOrganizationId { get; set; }

        public GetIndustrialPidOrganizationsInvokeArgs()
        {
        }
        public static new GetIndustrialPidOrganizationsInvokeArgs Empty => new GetIndustrialPidOrganizationsInvokeArgs();
    }


    [OutputType]
    public sealed class GetIndustrialPidOrganizationsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly ImmutableArray<Outputs.GetIndustrialPidOrganizationsOrganizationResult> Organizations;
        public readonly string? OutputFile;
        public readonly string? ParentOrganizationId;

        [OutputConstructor]
        private GetIndustrialPidOrganizationsResult(
            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            ImmutableArray<Outputs.GetIndustrialPidOrganizationsOrganizationResult> organizations,

            string? outputFile,

            string? parentOrganizationId)
        {
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            Organizations = organizations;
            OutputFile = outputFile;
            ParentOrganizationId = parentOrganizationId;
        }
    }
}
