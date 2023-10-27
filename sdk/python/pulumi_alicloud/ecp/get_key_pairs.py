# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'GetKeyPairsResult',
    'AwaitableGetKeyPairsResult',
    'get_key_pairs',
    'get_key_pairs_output',
]

@pulumi.output_type
class GetKeyPairsResult:
    """
    A collection of values returned by getKeyPairs.
    """
    def __init__(__self__, id=None, ids=None, key_pair_finger_print=None, name_regex=None, names=None, output_file=None, pairs=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if key_pair_finger_print and not isinstance(key_pair_finger_print, str):
            raise TypeError("Expected argument 'key_pair_finger_print' to be a str")
        pulumi.set(__self__, "key_pair_finger_print", key_pair_finger_print)
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        pulumi.set(__self__, "name_regex", name_regex)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if pairs and not isinstance(pairs, list):
            raise TypeError("Expected argument 'pairs' to be a list")
        pulumi.set(__self__, "pairs", pairs)

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
    @pulumi.getter(name="keyPairFingerPrint")
    def key_pair_finger_print(self) -> Optional[str]:
        return pulumi.get(self, "key_pair_finger_print")

    @property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[str]:
        return pulumi.get(self, "name_regex")

    @property
    @pulumi.getter
    def names(self) -> Sequence[str]:
        return pulumi.get(self, "names")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter
    def pairs(self) -> Sequence['outputs.GetKeyPairsPairResult']:
        return pulumi.get(self, "pairs")


class AwaitableGetKeyPairsResult(GetKeyPairsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetKeyPairsResult(
            id=self.id,
            ids=self.ids,
            key_pair_finger_print=self.key_pair_finger_print,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            pairs=self.pairs)


def get_key_pairs(ids: Optional[Sequence[str]] = None,
                  key_pair_finger_print: Optional[str] = None,
                  name_regex: Optional[str] = None,
                  output_file: Optional[str] = None,
                  opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetKeyPairsResult:
    """
    This data source provides the Ecp Key Pairs of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.130.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.ecp.get_key_pairs()
    pulumi.export("ecpKeyPairId1", ids.pairs[0].id)
    name_regex = alicloud.ecp.get_key_pairs(name_regex="^my-KeyPair")
    pulumi.export("ecpKeyPairId2", name_regex.pairs[0].id)
    ```


    :param Sequence[str] ids: A list of Key Pair IDs. Its element value is same as Key Pair Name.
    :param str key_pair_finger_print: The Private Key of the Fingerprint.
    :param str name_regex: A regex string to filter results by Key Pair name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['keyPairFingerPrint'] = key_pair_finger_print
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:ecp/getKeyPairs:getKeyPairs', __args__, opts=opts, typ=GetKeyPairsResult).value

    return AwaitableGetKeyPairsResult(
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        key_pair_finger_print=pulumi.get(__ret__, 'key_pair_finger_print'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        output_file=pulumi.get(__ret__, 'output_file'),
        pairs=pulumi.get(__ret__, 'pairs'))


@_utilities.lift_output_func(get_key_pairs)
def get_key_pairs_output(ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                         key_pair_finger_print: Optional[pulumi.Input[Optional[str]]] = None,
                         name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                         output_file: Optional[pulumi.Input[Optional[str]]] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetKeyPairsResult]:
    """
    This data source provides the Ecp Key Pairs of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.130.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.ecp.get_key_pairs()
    pulumi.export("ecpKeyPairId1", ids.pairs[0].id)
    name_regex = alicloud.ecp.get_key_pairs(name_regex="^my-KeyPair")
    pulumi.export("ecpKeyPairId2", name_regex.pairs[0].id)
    ```


    :param Sequence[str] ids: A list of Key Pair IDs. Its element value is same as Key Pair Name.
    :param str key_pair_finger_print: The Private Key of the Fingerprint.
    :param str name_regex: A regex string to filter results by Key Pair name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    ...
