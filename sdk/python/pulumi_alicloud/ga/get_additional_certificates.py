# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'GetAdditionalCertificatesResult',
    'AwaitableGetAdditionalCertificatesResult',
    'get_additional_certificates',
    'get_additional_certificates_output',
]

@pulumi.output_type
class GetAdditionalCertificatesResult:
    """
    A collection of values returned by getAdditionalCertificates.
    """
    def __init__(__self__, accelerator_id=None, certificates=None, id=None, ids=None, listener_id=None, output_file=None):
        if accelerator_id and not isinstance(accelerator_id, str):
            raise TypeError("Expected argument 'accelerator_id' to be a str")
        pulumi.set(__self__, "accelerator_id", accelerator_id)
        if certificates and not isinstance(certificates, list):
            raise TypeError("Expected argument 'certificates' to be a list")
        pulumi.set(__self__, "certificates", certificates)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if listener_id and not isinstance(listener_id, str):
            raise TypeError("Expected argument 'listener_id' to be a str")
        pulumi.set(__self__, "listener_id", listener_id)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)

    @property
    @pulumi.getter(name="acceleratorId")
    def accelerator_id(self) -> str:
        return pulumi.get(self, "accelerator_id")

    @property
    @pulumi.getter
    def certificates(self) -> Sequence['outputs.GetAdditionalCertificatesCertificateResult']:
        return pulumi.get(self, "certificates")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def ids(self) -> Sequence[str]:
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter(name="listenerId")
    def listener_id(self) -> str:
        return pulumi.get(self, "listener_id")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")


class AwaitableGetAdditionalCertificatesResult(GetAdditionalCertificatesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAdditionalCertificatesResult(
            accelerator_id=self.accelerator_id,
            certificates=self.certificates,
            id=self.id,
            ids=self.ids,
            listener_id=self.listener_id,
            output_file=self.output_file)


def get_additional_certificates(accelerator_id: Optional[str] = None,
                                ids: Optional[Sequence[str]] = None,
                                listener_id: Optional[str] = None,
                                output_file: Optional[str] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAdditionalCertificatesResult:
    """
    This data source provides the Ga Additional Certificates of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.150.0+.


    :param str accelerator_id: The ID of the GA instance.
    :param Sequence[str] ids: A list of Additional Certificate IDs.
    :param str listener_id: The ID of the listener. Only HTTPS listeners support this parameter.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    __args__ = dict()
    __args__['acceleratorId'] = accelerator_id
    __args__['ids'] = ids
    __args__['listenerId'] = listener_id
    __args__['outputFile'] = output_file
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:ga/getAdditionalCertificates:getAdditionalCertificates', __args__, opts=opts, typ=GetAdditionalCertificatesResult).value

    return AwaitableGetAdditionalCertificatesResult(
        accelerator_id=pulumi.get(__ret__, 'accelerator_id'),
        certificates=pulumi.get(__ret__, 'certificates'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        listener_id=pulumi.get(__ret__, 'listener_id'),
        output_file=pulumi.get(__ret__, 'output_file'))


@_utilities.lift_output_func(get_additional_certificates)
def get_additional_certificates_output(accelerator_id: Optional[pulumi.Input[str]] = None,
                                       ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                                       listener_id: Optional[pulumi.Input[str]] = None,
                                       output_file: Optional[pulumi.Input[Optional[str]]] = None,
                                       opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetAdditionalCertificatesResult]:
    """
    This data source provides the Ga Additional Certificates of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.150.0+.


    :param str accelerator_id: The ID of the GA instance.
    :param Sequence[str] ids: A list of Additional Certificate IDs.
    :param str listener_id: The ID of the listener. Only HTTPS listeners support this parameter.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    ...
