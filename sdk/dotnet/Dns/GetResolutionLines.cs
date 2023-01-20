// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Dns
{
    public static class GetResolutionLines
    {
        /// <summary>
        /// This data source provides a list of DNS Resolution Lines in an Alibaba Cloud account according to the specified filters.
        /// 
        /// &gt; **NOTE:** Available in 1.60.0.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var resolutionLinesDs = AliCloud.Dns.GetResolutionLines.Invoke(new()
        ///     {
        ///         LineCodes = new[]
        ///         {
        ///             "cn_unicom_shanxi",
        ///         },
        ///         OutputFile = "support_lines.txt",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstLineCode"] = resolutionLinesDs.Apply(getResolutionLinesResult =&gt; getResolutionLinesResult.Lines[0]?.LineCode),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetResolutionLinesResult> InvokeAsync(GetResolutionLinesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetResolutionLinesResult>("alicloud:dns/getResolutionLines:getResolutionLines", args ?? new GetResolutionLinesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides a list of DNS Resolution Lines in an Alibaba Cloud account according to the specified filters.
        /// 
        /// &gt; **NOTE:** Available in 1.60.0.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var resolutionLinesDs = AliCloud.Dns.GetResolutionLines.Invoke(new()
        ///     {
        ///         LineCodes = new[]
        ///         {
        ///             "cn_unicom_shanxi",
        ///         },
        ///         OutputFile = "support_lines.txt",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstLineCode"] = resolutionLinesDs.Apply(getResolutionLinesResult =&gt; getResolutionLinesResult.Lines[0]?.LineCode),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetResolutionLinesResult> Invoke(GetResolutionLinesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetResolutionLinesResult>("alicloud:dns/getResolutionLines:getResolutionLines", args ?? new GetResolutionLinesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetResolutionLinesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Domain Name.
        /// </summary>
        [Input("domainName")]
        public string? DomainName { get; set; }

        /// <summary>
        /// language.
        /// </summary>
        [Input("lang")]
        public string? Lang { get; set; }

        [Input("lineCodes")]
        private List<string>? _lineCodes;

        /// <summary>
        /// A list of lines codes.
        /// </summary>
        public List<string> LineCodes
        {
            get => _lineCodes ?? (_lineCodes = new List<string>());
            set => _lineCodes = value;
        }

        [Input("lineDisplayNames")]
        private List<string>? _lineDisplayNames;

        /// <summary>
        /// A list of line display names.
        /// </summary>
        public List<string> LineDisplayNames
        {
            get => _lineDisplayNames ?? (_lineDisplayNames = new List<string>());
            set => _lineDisplayNames = value;
        }

        [Input("lineNames")]
        private List<string>? _lineNames;
        public List<string> LineNames
        {
            get => _lineNames ?? (_lineNames = new List<string>());
            set => _lineNames = value;
        }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The ip of user client.
        /// </summary>
        [Input("userClientIp")]
        public string? UserClientIp { get; set; }

        public GetResolutionLinesArgs()
        {
        }
        public static new GetResolutionLinesArgs Empty => new GetResolutionLinesArgs();
    }

    public sealed class GetResolutionLinesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Domain Name.
        /// </summary>
        [Input("domainName")]
        public Input<string>? DomainName { get; set; }

        /// <summary>
        /// language.
        /// </summary>
        [Input("lang")]
        public Input<string>? Lang { get; set; }

        [Input("lineCodes")]
        private InputList<string>? _lineCodes;

        /// <summary>
        /// A list of lines codes.
        /// </summary>
        public InputList<string> LineCodes
        {
            get => _lineCodes ?? (_lineCodes = new InputList<string>());
            set => _lineCodes = value;
        }

        [Input("lineDisplayNames")]
        private InputList<string>? _lineDisplayNames;

        /// <summary>
        /// A list of line display names.
        /// </summary>
        public InputList<string> LineDisplayNames
        {
            get => _lineDisplayNames ?? (_lineDisplayNames = new InputList<string>());
            set => _lineDisplayNames = value;
        }

        [Input("lineNames")]
        private InputList<string>? _lineNames;
        public InputList<string> LineNames
        {
            get => _lineNames ?? (_lineNames = new InputList<string>());
            set => _lineNames = value;
        }

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The ip of user client.
        /// </summary>
        [Input("userClientIp")]
        public Input<string>? UserClientIp { get; set; }

        public GetResolutionLinesInvokeArgs()
        {
        }
        public static new GetResolutionLinesInvokeArgs Empty => new GetResolutionLinesInvokeArgs();
    }


    [OutputType]
    public sealed class GetResolutionLinesResult
    {
        public readonly string? DomainName;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string? Lang;
        /// <summary>
        /// Line code.
        /// </summary>
        public readonly ImmutableArray<string> LineCodes;
        /// <summary>
        /// A list of line display names.
        /// </summary>
        public readonly ImmutableArray<string> LineDisplayNames;
        public readonly ImmutableArray<string> LineNames;
        /// <summary>
        /// A list of cloud resolution line. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetResolutionLinesLineResult> Lines;
        public readonly string? OutputFile;
        public readonly string? UserClientIp;

        [OutputConstructor]
        private GetResolutionLinesResult(
            string? domainName,

            string id,

            string? lang,

            ImmutableArray<string> lineCodes,

            ImmutableArray<string> lineDisplayNames,

            ImmutableArray<string> lineNames,

            ImmutableArray<Outputs.GetResolutionLinesLineResult> lines,

            string? outputFile,

            string? userClientIp)
        {
            DomainName = domainName;
            Id = id;
            Lang = lang;
            LineCodes = lineCodes;
            LineDisplayNames = lineDisplayNames;
            LineNames = lineNames;
            Lines = lines;
            OutputFile = outputFile;
            UserClientIp = userClientIp;
        }
    }
}
